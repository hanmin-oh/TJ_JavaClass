package com.tjoeun.threadTest;

// Runnable 인터페이스를 구현받고 run() 메소드를
public class AlpahThread implements Runnable, Parants {
	
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

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertUserInfo() {
		// TODO Auto-generated method stub
		
	}
	
}
