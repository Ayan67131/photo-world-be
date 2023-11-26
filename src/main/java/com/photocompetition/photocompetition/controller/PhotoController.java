package com.photocompetition.photocompetition.controller;

import com.photocompetition.photocompetition.dto.PhotoDto;
import com.photocompetition.photocompetition.model.PhotoModel;
import com.photocompetition.photocompetition.service.PhotoService;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("photo")
@CrossOrigin(maxAge = 500)
@AllArgsConstructor
public class PhotoController {

    private PhotoService photoService;

    @GetMapping("find-one")
    public List<PhotoDto> getPhotosByContest(@RequestParam(value = "id") int id) {
        return photoService.fetchPhotosByContestId(id);
    }

    @GetMapping("all")
    public ResponseEntity<List<PhotoDto>> getAllPhotos(){
        return new ResponseEntity<>(photoService.fetchAllPhotos(),HttpStatus.OK);
    }

    @PostMapping("upload")
    public void addPhoto(@RequestParam("file") MultipartFile file,
                         @RequestParam("contestId") int contestId,
                         @RequestParam("userId") String userId) throws IOException {
        photoService.uploadPhoto(file, contestId, userId);
    }
}
