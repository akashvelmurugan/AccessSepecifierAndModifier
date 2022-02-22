package com.publicone;

import com.publictwo.Sample;

public class BaseClass extends Sample{

	public static void main(String[] args) {
		//SAMEPAKAGE
		Public publicOne= new Public();
		publicOne.methodSamePakage();

		//DIFFERENTPAKAGE
		BaseClass baseClass= new BaseClass();
		baseClass.methoDifferentPakage();

	}
}
