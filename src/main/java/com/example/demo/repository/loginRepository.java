package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Login;
//import com.example.demo.model.Login;

public interface loginRepository extends JpaRepository<Login, String> {
	public Login findByVoterid(String voterid);

}
