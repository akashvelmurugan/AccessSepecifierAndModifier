package com.syncronise;

import com.publicone.Public;

class Number {
	synchronized public void table (int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n+"*"+i+"="+n*i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Syncronise {
	public static void main(String[] args) throws InterruptedException {
		Number number = new Number();
		Thread thread = new Thread(){
			public void run() {
				number.table(5);
			}
		};
		Thread threadTwo = new Thread(){
			public void run() {
				number.table(10);
			}
		};
		thread.start();
		threadTwo.start();
	}
}




