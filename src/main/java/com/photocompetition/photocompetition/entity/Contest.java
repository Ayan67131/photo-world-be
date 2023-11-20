package com.photocompetition.photocompetition.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "contest")
public class Contest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String coverPhotoUrl;
    private String sponsor;
    private String judge;
    private String bannerUrl;
    private LocalDate endDate;
    private int photoCount;
    private int photographerCount;
    @Column(length = 1000)
    private String brief;
    private String steps;
    private LocalDate winnerAnnouncementDate;
    private long remainingDays;

//    @ManyToMany
//    @JoinTable(
//            name="contest_user",joinColumns = @JoinColumn(name = "contest_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id"))
//    private List<User> users;
//
//    @ManyToMany
//    @JoinTable(
//            name="contest_photo",joinColumns = @JoinColumn(name = "contest_id"),
//            inverseJoinColumns = @JoinColumn(name = "photo_id"))
//    private List<Photo> photo;
}
