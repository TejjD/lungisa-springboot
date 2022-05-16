package za.co.thedevs.lungisaspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import za.co.thedevs.lungisaspringboot.services.AmazonClientService;

@RestController
@RequestMapping("/storage/")
public class S3BucketController {

    private final AmazonClientService amazonClient;

    @Autowired
    S3BucketController(AmazonClientService amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("api/v1/upload")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return this.amazonClient.uploadFile(file);
    }

    @DeleteMapping("api/v1/delete")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }
}
