package com.evergent.corejava.oops;
public class UserLogin_OverLoading {
	public void loginData()
	{
		System.out.println("Login Info");
	}
	public void loginData(String uname,String pass)
	{
		System.out.println("Usernmae : "+uname);
		System.out.println("Password : "+pass);
	}
	public void loginData(String uname,String pass,String captcha)
	{
		System.out.println("Username : "+uname);
		System.out.println("Password : "+pass);
	}
	public void loginData(int mobile,String pass)
	{
		System.out.println("mobile : "+mobile);
		System.out.println("Password : "+pass);
	}
	public void show()
	{
		System.out.println("Show method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin_OverLoading login=new UserLogin_OverLoading();
		login.loginData();
		login.loginData("Raj","Raj123");
		login.loginData("Ravi","Ravi123","ABC");
		login.loginData(1234567890,"Welcome");
		login.show();
	}
}
