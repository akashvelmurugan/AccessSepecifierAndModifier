package com.serializationmethod;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	 transient public String userName;
	 transient public 
	 String password;
	
}
public class Srialization{
	public static void main(String[] args) throws FileNotFoundException, IOException {

		User user = new User();
		user.userName="Saravanan";
		user.password="12345";

		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("D:\\trancient\\trancient.txt"));
		outputStream.writeObject(user);


	}
}

