package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AccessVoter;

public interface AccessVoterRepository extends JpaRepository<AccessVoter, String>{
	public AccessVoter findByStudentid(String studentid);

}
