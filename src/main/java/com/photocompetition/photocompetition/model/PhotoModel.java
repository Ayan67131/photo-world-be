package com.photocompetition.photocompetition.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
public class PhotoModel {
    private String userName;
    private int contestId;
    private MultipartFile file;
}
