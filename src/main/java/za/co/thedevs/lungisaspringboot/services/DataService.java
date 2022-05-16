package za.co.thedevs.lungisaspringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.thedevs.lungisaspringboot.models.Data;
import za.co.thedevs.lungisaspringboot.repositories.DataRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public void save(Data data) {
        dataRepository.save(data);
    }

    public List<Data> getData() {
        return dataRepository.findAll();
    }
}

