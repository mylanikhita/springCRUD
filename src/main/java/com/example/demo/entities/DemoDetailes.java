package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


 @Entity
 @Table(name="student_details")
 public class DemoDetailes {

	@Id
	private long roll_no;
	private String name;
	private String mail_id;
	
	public long getId()
	{
		return roll_no;
	}

	public long getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(long roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
 
	
	
	
}
