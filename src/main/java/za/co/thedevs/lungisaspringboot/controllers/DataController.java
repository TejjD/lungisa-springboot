package za.co.thedevs.lungisaspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.thedevs.lungisaspringboot.models.Data;
import za.co.thedevs.lungisaspringboot.services.DataService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/data/")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("api/v1/getData")
    public List<Data> getData() {
        return dataService.getData();
    }

    @PostMapping("api/v1/addData")
    public ResponseEntity<Data> saveData(@RequestBody Data data) {
        try {
            dataService.save(data);
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
    }
}
