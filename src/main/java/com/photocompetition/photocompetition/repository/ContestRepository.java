package com.photocompetition.photocompetition.repository;

import com.photocompetition.photocompetition.entity.Contest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContestRepository extends JpaRepository<Contest, Integer> {
}
