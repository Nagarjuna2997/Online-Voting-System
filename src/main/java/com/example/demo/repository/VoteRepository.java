package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Vote;
import com.example.demo.model.VoterAccess;

public interface VoteRepository extends JpaRepository<Vote, String> {
	public Vote findByVoterid(String voterid);

}
