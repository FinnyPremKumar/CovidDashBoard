package com.covidvirrus.controller;

import java.sql.SQLException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.covidvirrus.DAO.LoginDAO;
import com.covidvirrus.bo.SignUpBO;
@RestController
public class LoginController {
	@PostMapping(value="/login",produces = MediaType.APPLICATION_JSON_VALUE)
	public String login(@RequestBody SignUpBO loginBO) throws SQLException {
		System.out.println(loginBO.getEmailId());
		System.out.println(loginBO.getPassword());
		LoginDAO loginDao=new LoginDAO();
		if(loginDao.validateLogin(loginBO))
		{
			return "logged in";
		}
		else
		{
			return "incorrect username/password";
		}
	}
	@GetMapping(value="/sampleget")
	public void sampleGetRequest() {
		System.out.println("Get mapping method called");
	}
}

