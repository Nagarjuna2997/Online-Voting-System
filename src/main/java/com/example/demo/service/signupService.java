package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.demo.model.Login;
import com.example.demo.model.Signup;
import com.example.demo.repository.signupRepository;
@Service
public class signupService {
	@Autowired
	private signupRepository sg;
	public void addsign(Signup sp)
	{
		sg.save(sp);
	}
	public  Signup findVoterId(String voterid)
	{
		 return sg.findByVoterid(voterid);
	}
	/*public List<Signup> getAllRecords()
	{
		return (List<Signup>)sg.findall();
		
	}
	*/
	

}
