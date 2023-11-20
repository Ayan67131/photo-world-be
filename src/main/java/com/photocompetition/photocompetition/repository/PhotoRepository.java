package com.photocompetition.photocompetition.repository;

import com.photocompetition.photocompetition.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo,Integer> {

    List<Photo> findByContestId(int id);
}
