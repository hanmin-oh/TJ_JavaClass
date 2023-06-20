package com.tjoeun.score;

public class ScoreMain {
	
	public static void main(String[] args) {
		/*
		ScoreVO score1 = new ScoreVO();
		ScoreVO score2 = new ScoreVO();
		ScoreVO score3 = new ScoreVO();
		
		System.out.println(score1.count);
		score2.count = 100;
		System.out.println(score2.count);
		//static 변수는 현재 클래스로 생성하는 모든 객체에서 공유하므로 score3과 socre1의 count도 수정된다.
		System.out.println(score3.count);
		System.out.println(score1.count); //static을 붙인 변수는 하나의 카운트가 초기화되면 같은 값으로 초기화된다. 
		System.out.println(ScoreVO.count);
		*/
		
		ScoreVO so1 = new ScoreVO("이순신" , 100, 100, 99);
		ScoreVO so2 = new ScoreVO("장영실" , 45, 71, 99);
		ScoreVO so3 = new ScoreVO("강감찬" , 24, 58, 99);
		ScoreVO so4 = new ScoreVO("이성계" , 100, 78, 99);
		ScoreVO so5 = new ScoreVO("장보고" , 76, 85, 99);
		ScoreVO so6 = new ScoreVO("설윤후" , 87, 65, 99);
		
		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(so1);
		scoreList.addScore(so2);
		scoreList.addScore(so3);
		scoreList.addScore(so4);
		scoreList.addScore(so5);
		scoreList.addScore(so6);
		
		System.out.println(scoreList);
		
	}

}
