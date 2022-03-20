package com.volataile;

public class Aplication {

	private static volatile int counter=0;

	public static void main(String[] args) throws InterruptedException {
		new ReadingThread().start();
		new WrittingThread().start();
	}
	static class ReadingThread extends Thread{
		@Override
		public void run() {
			while (counter<4) {

			}
			System.out.println("counter reached 4."+System.currentTimeMillis());
		}
	}
	static class WrittingThread extends Thread{
		@Override
		public void run() {
			while (counter<10) {
				counter++;				
				System.out.println("counter increased "+counter+" "+System.currentTimeMillis());
			}
		}
	}
}
