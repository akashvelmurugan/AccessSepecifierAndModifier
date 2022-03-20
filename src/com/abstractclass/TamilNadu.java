package com.abstractclass;

public class TamilNadu extends AbstractClass{

	@Override
	void culture() {
		System.out.println("South Culture");
	}
	@Override
	void food() {
		System.out.println("South Food Culture");		
	}
	public static void main(String[] args) {
		TamilNadu tamilNadu=new TamilNadu();
		tamilNadu.aadhar();
		tamilNadu.voterId();
		tamilNadu.culture();
		tamilNadu.food();
	}

}
