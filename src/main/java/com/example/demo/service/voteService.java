package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vote;
import com.example.demo.model.VoterAccess;
import com.example.demo.repository.VoteRepository;

@Service
public class voteService {

	@Autowired
	private VoteRepository sg;
	public void addlog(Vote sp)
	{
		sg.save(sp);
	}
	public  Vote findVoterId(String voterid)
	{
		 return sg.findByVoterid(voterid);
	}
	
	
}
