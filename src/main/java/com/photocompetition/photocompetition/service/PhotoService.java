package com.photocompetition.photocompetition.service;

import com.photocompetition.photocompetition.dto.PhotoDto;
import com.photocompetition.photocompetition.entity.Contest;
import com.photocompetition.photocompetition.entity.Photo;
import com.photocompetition.photocompetition.entity.User;
import com.photocompetition.photocompetition.mapper.PhotoMapper;
import com.photocompetition.photocompetition.model.PhotoModel;
import com.photocompetition.photocompetition.repository.ContestRepository;
import com.photocompetition.photocompetition.repository.PhotoRepository;
import com.photocompetition.photocompetition.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PhotoService {

    private PhotoRepository photoRepository;
    private PhotoMapper photoMapper;
    private ContestRepository contestRepository;
    private UserRepository userRepository;

    public List<PhotoDto> fetchPhotosByContestId(int id){
        return photoRepository.findByContestId(id)
                .stream().map(photoMapper::entityToDto).collect(Collectors.toList());
    }

    public void uploadPhoto(MultipartFile file, int contestId, String userId) throws IOException {
        String fileName = file.getOriginalFilename();
        String filePath = "D://photo-competition/photo-world/src/images/contest-images/" + fileName;
        file.transferTo(new File(filePath));
        User user = userRepository.findByEmail(userId).stream().findFirst().orElseThrow();
        Contest contest = contestRepository.findById(contestId).stream().findFirst().orElseThrow();
        Photo photo = new Photo();
        photo.setContest(contest);
        photo.setUrl(filePath);
        photo.setUser(user);
        photoRepository.save(photo);
    }

    public List<PhotoDto> fetchAllPhotos(){
        return photoRepository.findAll()
                .stream().map(photoMapper::entityToDto)
                .collect(Collectors.toList());
    }
}
