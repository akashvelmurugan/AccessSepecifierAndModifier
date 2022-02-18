package com.privetekeyword;

public class PrivateKeyWord {
	private void PrivateMethod() {
		System.out.println("Allow Inside The Class");
	}
	
	public static void main(String[] args) {
		PrivateKeyWord keyWord = new PrivateKeyWord();
		keyWord.PrivateMethod();
	
	}
}
