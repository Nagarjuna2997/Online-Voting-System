package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.AdminLogin;
import com.example.demo.model.SuperAdminLogin;
import com.example.demo.repository.AdminLoginRepository;
import com.example.demo.repository.SuperAdminLoginRepository;
@Service
public class superAdminLoginService {
	private SuperAdminLoginRepository sg;
	public void addlog(SuperAdminLogin sp)
	{
		sg.save(sp);
	}
	public  SuperAdminLogin findVoterId(String voterid)
	{
		 return sg.findByVoterid(voterid);
	}

}
