package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.modal.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
