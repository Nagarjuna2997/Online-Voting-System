package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.model.VoterAccess;
import com.example.demo.repository.VoterAccessRepository;

@Service
public class voterAccessService {

	@Autowired
	private VoterAccessRepository sg;
	public void addlog(VoterAccess sp)
	{
		sg.save(sp);
	}
	public  VoterAccess findVoterId(String voterid)
	{
		 return sg.findByVoterid(voterid);
	}
	
	
}
