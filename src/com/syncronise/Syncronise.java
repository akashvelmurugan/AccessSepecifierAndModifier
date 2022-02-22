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
	public void table1(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n+"*"+i+"="+n*i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public class Syncronise {
		public void main(String[] args) throws InterruptedException {
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
			Thread threadThree = new Thread(){
				public void run() {
					number.table1(10);
				}
			};
			thread.start();
			threadTwo.start();
			threadThree.start();
		}
	}
}



