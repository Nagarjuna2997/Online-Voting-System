package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminLogin;
import com.example.demo.repository.AdminLoginRepository;
//import com.example.demo.model.Login;
import com.example.demo.repository.loginRepository;
@Service
public class adminLoginService {
	@Autowired
	private AdminLoginRepository sg;
	public void addlog(AdminLogin sp)
	{
		sg.save(sp);
	}
	public  AdminLogin findVoterId(String voterid)
	{
		 return sg.findByVoterid(voterid);
	}

}
