package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Login;
import com.example.demo.model.VoterAccess;

public interface VoterAccessRepository extends JpaRepository<VoterAccess, String> {
	public VoterAccess findByVoterid(String voterid);

}
