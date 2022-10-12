package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AdminLogin;

public interface AdminLoginRepository extends JpaRepository<AdminLogin, String> {
	public AdminLogin findByVoterid(String voterid);

}
