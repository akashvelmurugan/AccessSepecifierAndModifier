package com.partialabstraction;

public class TamilCulture extends AbstractMethod{



	@Override
	void culture() {
		System.out.println("Tamil Culture");
	}

	@Override
	void foodCulture() {
		System.out.println("Tamil Food Habit");
	}
	public static void main(String[] args) {
		TamilCulture culture = new TamilCulture();
		culture.pancard();
		culture.voterId();
		culture.culture();
		culture.foodCulture();

	}
}
