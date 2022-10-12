package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SuperAdminLogin;

public interface SuperAdminLoginRepository extends JpaRepository<SuperAdminLogin, String> {
	public SuperAdminLogin findByVoterid(String voterid);

}
