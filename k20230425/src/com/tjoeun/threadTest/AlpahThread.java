package com.tjoeun.threadTest;

// Runnable 인터페이스를 구현받고 run() 메소드를
public class AlpahThread implements Runnable {

	@Override 
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
