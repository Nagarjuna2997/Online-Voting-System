package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AddAdmin;
import com.example.demo.model.Signup;
import com.example.demo.repository.AddAdminRepository;

@Service
public class addAdminService {
	
	@Autowired
	private AddAdminRepository sg;
	public void addsign(AddAdmin aa)
	{
		sg.save(aa);
	}
	public  AddAdmin findAdminId(String adminid)
	{
		 return sg.findByAdminid(adminid);
	}

}
