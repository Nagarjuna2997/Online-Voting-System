package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SubmitVote;
import com.example.demo.repository.SubmitVoteRepository;

@Service
public class submitVoteService {
	@Autowired
    SubmitVoteRepository sg;
    public void addreservationrecord(SubmitVote voterid)
    {
      sg.save(voterid);
    }

}
