package com.niit.logincontroller;

public class LoginDAO {
	public boolean isvaliduser(String Userid,String Password)
	{
		if (Userid.equals(Password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
