package com.covidvirrus.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.covidvirrus.bo.SignUpBO;
import com.covidvirrus.controller.ConectionController;

public class SignUpDAO 
{
	public int signUpNow(SignUpBO signUpBO) throws SQLException
	{
		
			PreparedStatement prest=ConectionController.getMyConnection().prepareStatement("insert into coronacredentials.entiredata values(?,?,?,?,?)");
			prest.setString(1, signUpBO.getUsername());
			prest.setString(2, signUpBO.getEmailId());
			prest.setString(3, signUpBO.getMobileNo());
			prest.setInt(4, signUpBO.getPassword());
			prest.setInt(5, signUpBO.getConfirmPassword());
			
			int rs=prest.executeUpdate();
		return rs;
	}
}