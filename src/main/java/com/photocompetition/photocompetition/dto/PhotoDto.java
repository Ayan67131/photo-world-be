package com.photocompetition.photocompetition.dto;

import com.photocompetition.photocompetition.entity.Contest;
import com.photocompetition.photocompetition.entity.User;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class PhotoDto {
    private int id;
    private String url;
    private Contest contest;
    private User user;
}
