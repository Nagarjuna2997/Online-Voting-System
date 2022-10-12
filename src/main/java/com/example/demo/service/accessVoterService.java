package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AccessVoter;
import com.example.demo.repository.AccessVoterRepository;

@Service
public class accessVoterService {
	
	@Autowired
	public AccessVoterRepository sg;
	public AccessVoter findStudentid(String studentid)
	{
		return sg.findByStudentid(studentid);
	}
	
}
