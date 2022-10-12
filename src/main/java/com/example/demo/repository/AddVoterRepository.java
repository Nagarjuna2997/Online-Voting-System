package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AddAdmin;
import com.example.demo.model.AddVoter;

public interface AddVoterRepository extends JpaRepository<AddVoter, String>{

	
}
