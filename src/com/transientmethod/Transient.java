package com.transientmethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Savepoint;

import org.omg.CORBA_2_3.portable.OutputStream;

class User implements Serializable{
	public String userName;
	transient public String password;
}
public class Transient{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		User user=new User();
		user.userName="Saravanan";
		user.password="12345";

		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("D:\\trancient\\trancient.txt"));
		outputStream.writeObject(user);

		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("D:\\trancient\\trancient.txt"));
		User readObject = (User)objectInputStream.readObject();

		System.out.println(readObject.userName);
		System.out.println(readObject.password);
	
	
	}
}