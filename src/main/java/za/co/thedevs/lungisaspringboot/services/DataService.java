package za.co.thedevs.lungisaspringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import za.co.thedevs.lungisaspringboot.models.Data;
import za.co.thedevs.lungisaspringboot.models.FlutterData;
import za.co.thedevs.lungisaspringboot.repositories.DataRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    @Autowired
    private AmazonClientService amazonClientService;

    public void save(Data data) {
        dataRepository.save(data);
    }

    public void saveFlutterImage(FlutterData flutterData, MultipartFile file) {
        String imageURL = amazonClientService.uploadFile(file);

        Data data = new Data();

        data.setSeverity(flutterData.getSeverity());
        data.setComment(flutterData.getComment());
        data.setImageUrl(imageURL);
        data.setIssue(flutterData.getIssue());
        data.setDatetime(flutterData.getDatetime());
        data.setLocation(flutterData.getLocation());

        save(data);
    }

    public List<Data> getData() {
        return dataRepository.findAll();
    }
}

