package com.symcronisemultithreading;

	class first extends Thread{
		public void run() {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
	}
	class second extends Thread{
		public void run() {
			for (int i = 5; i < 10; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}	
	}
	public class MultyThreading {
		public static void main(String[] args) throws InterruptedException {
			first first= new first();   //thread
			second second= new second();

			first.start();
			second.start();
			//		first.join();
			//		second.join();

			//System.out.println("Done ................");
		}
	}

