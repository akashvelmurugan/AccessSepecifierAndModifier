package com.serializationmethod;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	transient String userName;
	transient String password;

}
public class Srialization{
	public static void main(String[] args) throws FileNotFoundException, IOException {

		User user = new User();
		user.userName="Saravanan";
		user.password="password";

		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("D:\\trancient\\trancient.txt"));
		outputStream.writeObject(user);


	}
}

