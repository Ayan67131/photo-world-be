package com.photocompetition.photocompetition.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ContestDto {
    private int id;
    private String name;
    private String coverPhotoUrl;
    private String sponsor;
    private String judge;
    private LocalDate endDate;
    private int photoCount;
    private int photographerCount;
    private String brief;
    private String steps;
    private LocalDate winnerAnnouncementDate;
    private long remainingDays;
}
