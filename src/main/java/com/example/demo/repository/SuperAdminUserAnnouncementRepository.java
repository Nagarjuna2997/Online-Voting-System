package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Login;
import com.example.demo.model.Superadminuserannouncement;

public interface SuperAdminUserAnnouncementRepository extends JpaRepository<Superadminuserannouncement, String>{

	public SuperAdminUserAnnouncementRepository findByAnnouncement(String announcement);

	//public Object getAnnouncement();

}
