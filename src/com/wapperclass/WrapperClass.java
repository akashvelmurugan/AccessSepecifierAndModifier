package com.wapperclass;

public class WrapperClass {
	public static void main(String[] args) {
		
		//PRIMITIVE DATATYPE
		int i=10;
		
		//BOXING
		Integer boxing=Integer.valueOf(i); //boxing
		System.out.println("boxing   : "+boxing);
		 
		//UNBOXING
		Integer integer=Integer.valueOf(20);
		Integer unboxing = integer.intValue();
		System.out.println("unboxing : "+unboxing);


		Integer integer2=20;
		
	}
}
