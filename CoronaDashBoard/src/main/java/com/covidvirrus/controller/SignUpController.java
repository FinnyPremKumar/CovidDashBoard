package com.covidvirrus.controller;

import java.sql.SQLException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covidvirrus.DAO.SignUpDAO;
import com.covidvirrus.bo.SignUpBO;

@RestController
public class SignUpController 
{
	
		@PostMapping(value="/signup" , produces = MediaType.APPLICATION_JSON_VALUE)
		public String signUp(@RequestBody SignUpBO signUpBO) throws SQLException
		{
			
			System.out.println(signUpBO.getUsername());
			System.out.println(signUpBO.getEmailId());
			System.out.println(signUpBO.getMobileNo());
			System.out.println(signUpBO.getPassword());
			System.out.println(signUpBO.getConfirmPassword());
			SignUpDAO signUpDao=new SignUpDAO();
			if(4<signUpDao.signUpNow(signUpBO))
			{
				return "Sign up successfully!! Redirecting to Login Page";
			}
			else
			{
				return "Please check all fields are not empty";
			}
			
		}
	
}
