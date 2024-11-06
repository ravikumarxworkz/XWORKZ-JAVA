package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.modal.User;
import com.exam.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;

	public Boolean createuser(User user) {
		if (user != null) {
			User save = this.repo.save(user);
			if (save != null) {
				return true;
			}
		}
		return false;
	}

	public List<User> getAllUsers() {
		return this.repo.findAll();
	}

}
