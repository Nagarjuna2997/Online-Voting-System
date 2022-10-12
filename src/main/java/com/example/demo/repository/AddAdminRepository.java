package com.example.demo.repository;

import com.example.demo.model.AddAdmin;
import com.example.demo.model.AdminLogin;
import com.example.demo.model.Signup;
import com.example.demo.model.VoterAccess;

import org.springframework.data.jpa.repository.JpaRepository;
public interface AddAdminRepository extends JpaRepository<AddAdmin, String>{
	
	public AddAdmin findByAdminid(String adminid);

	//public void save(VoterAccess va);

	//public void save(AddAdmin aa);

	//public AddAdmin findVoterId(String adminid);

	//public void save(AddAdmin aa);

	//public Signup findByAdminid(String adminid);

}
