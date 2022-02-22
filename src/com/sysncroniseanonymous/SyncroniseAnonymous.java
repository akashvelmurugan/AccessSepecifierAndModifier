package com.sysncroniseanonymous;

//class First implements Runnable{
//		public void run() {
//			for (int i = 0; i < 5; i++) {
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(i);
//			}
//		}
//}
class Second extends Thread{
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
public class SyncroniseAnonymous {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
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
		};
		Thread thread=new Thread(runnable);
		Second second= new Second();
		thread.start();
		second.start();
		//		first.join();
		//		second.join();
		//      System.out.println("Done ................");
	}
}


