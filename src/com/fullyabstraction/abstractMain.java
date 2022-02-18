package com.fullyabstraction;

public class abstractMain implements Car {
	public static void main(String[] args) {
		abstractMain abstractMain= new abstractMain();

		abstractMain.ratio();
		abstractMain.tyre();
		abstractMain.engine();
		abstractMain.gear();
		abstractMain.seatBelt();
	}
	@Override
	public void ratio() {
		System.out.println("Sony Sound System");	
	}
	@Override
	public void tyre() {
		System.out.println("MRF tyres tubeless");
	}
	@Override
	public void engine() {
		System.out.println("TATA Machine");
	}
	@Override
	public void gear() {
		System.out.println("Manul and Automatic Gear System -Two In One");
	}
	@Override
	public void seatBelt() {
		System.out.println("FullLether");
	}
}
