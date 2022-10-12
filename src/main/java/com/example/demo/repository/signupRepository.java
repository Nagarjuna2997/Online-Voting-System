package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Signup;
//import com.klu.demo.model.signup;
//import com.klu.demo.model.signup;

public interface signupRepository extends JpaRepository<Signup,String> {
	public Signup findByVoterid(String voterid);
	//List<Signup> findall();
	
}
