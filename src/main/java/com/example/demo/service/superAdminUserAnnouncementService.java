package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Superadminuserannouncement;
import com.example.demo.repository.SuperAdminUserAnnouncementRepository;
@Service
public class superAdminUserAnnouncementService {
	@Autowired
	private SuperAdminUserAnnouncementRepository sg;
	
	public void addAnnouncement(Superadminuserannouncement sp)
	{
		sg.save(sp);
	}
	public  SuperAdminUserAnnouncementRepository findAnnouncement(String announcement)
	{
		 return sg.findByAnnouncement(announcement);
	}
	
	public List<Superadminuserannouncement> getAllRecords()
	{
	return (List<Superadminuserannouncement>)sg.findAll();
	}
}
