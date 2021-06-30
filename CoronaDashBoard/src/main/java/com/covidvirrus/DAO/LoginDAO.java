package com.covidvirrus.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.covidvirrus.bo.SignUpBO;
import com.covidvirrus.controller.ConectionController;

public class LoginDAO 
{
	public boolean validateLogin(SignUpBO sign) throws SQLException
	{
		boolean status=false;
		PreparedStatement prest= ConectionController.getMyConnection().prepareStatement("select * from coronacredentials.entiredata where username=? and password=?");
		prest.setString(1, sign.getUsername());
		prest.setInt(2, sign.getPassword());
		ResultSet rs = prest.executeQuery();
		status=rs.next();
		return status;
	}
}
