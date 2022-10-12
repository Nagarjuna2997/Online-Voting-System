package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AddAdmin;
import com.example.demo.model.AddVoter;
import com.example.demo.repository.AddVoterRepository;

@Service
public class addVoterService {
	@Autowired
	private AddVoterRepository sg;
	public void addsign(AddVoter aa)
	{
		sg.save(aa);
	}
	


}
