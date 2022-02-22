package com.wapperclass;

public class WrapperClass {
	public static void main(String[] args) {

		//PRIMITIVE DATATYPE
		int i=10;
		System.out.println("primitive datatype : "+i);

		//BOXING
		Integer boxing=Integer.valueOf(i); //boxing
		System.out.println("boxing       : "+boxing);

		//UNBOXING,UNWRAPPING
		Integer integer=Integer.valueOf(20);
		Integer unboxing = integer.intValue();
		System.out.println("unboxing     : "+unboxing);

		//AUTOBOXING
		Integer integer2=20;
		System.out.println("autoboxing   : "+integer2);

		//AUTOUNBOXING
		int k=boxing;
		System.out.println("autounboxing : "+k);

		//STRINGTOINTEGER
		String stringValue="123";
		int integerValue = Integer.parseInt(stringValue);
		System.out.println("STRINGTOINTEGER DIVIDED BY 10 : "+integerValue/10);

		//STRINGTOBYTE
		String string = "123";
		Byte byte1 =Byte.parseByte(string);
		System.out.println("STRINGTOBYTE : "+string);

		//STRINGTOINTEGER RUNTIME ERROR
		String stringValueString="java";
		int integerValueInteger = Integer.parseInt(stringValueString);
		System.out.println("STRINGTOINTEGER DIVIDED BY 10 : "+integerValueInteger/10);

	}
}
