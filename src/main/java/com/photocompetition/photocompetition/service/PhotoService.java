package com.photocompetition.photocompetition.service;

import com.photocompetition.photocompetition.dto.PhotoDto;
import com.photocompetition.photocompetition.mapper.PhotoMapper;
import com.photocompetition.photocompetition.repository.PhotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PhotoService {

    private PhotoRepository photoRepository;
    private PhotoMapper photoMapper;

    public List<PhotoDto> fetchPhotosByContestId(int id){
        return photoRepository.findByContestId(id)
                .stream().map(photoMapper::entityToDto).collect(Collectors.toList());
    }
}
