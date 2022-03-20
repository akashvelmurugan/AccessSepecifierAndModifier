package com.abstractclass;

public class Kerala extends AbstractClass{

	@Override
	void culture() {
		System.out.println("Kerala Culture");		
	}

	@Override
	void food() {
		System.out.println("Kerala Food");		
	}
	public static void main(String[] args) {
		Kerala kerala= new Kerala();
		kerala.aadhar();
		kerala.voterId();
		kerala.culture();
		kerala.food();

	}
}
