package com.photocompetition.photocompetition.repository;

import com.photocompetition.photocompetition.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByEmail(String email);
}
