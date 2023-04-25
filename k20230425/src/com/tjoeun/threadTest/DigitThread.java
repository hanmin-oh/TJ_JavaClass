package com.tjoeun.threadTest;


//Thread 클래스를 상속받고 run()메소드를 Override해서 멀티 스래드를 구현한다. 
public class DigitThread extends Thread { 
	
	
	@Override
	public void run() {
		for(int i = 1 ; i<26 ; i++ ) {
			System.out.print(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		super.run();
	}
	
	
}
