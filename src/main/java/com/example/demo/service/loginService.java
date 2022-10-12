package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repository.loginRepository;
@Service
public class loginService {
	@Autowired
	private loginRepository sg;
	public void addlog(Login sp)
	{
		sg.save(sp);
	}
	public  Login findVoterId(String voterid)
	{
		 return sg.findByVoterid(voterid);
	}

}
