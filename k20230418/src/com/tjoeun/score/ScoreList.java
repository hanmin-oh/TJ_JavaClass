package com.tjoeun.score;

import java.util.ArrayList;

import com.tjoeun.bookshop.BookList;

public class ScoreList {
	
	private ArrayList<ScoreVO> scoreList = new ArrayList<>();

	public ArrayList<ScoreVO> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<ScoreVO> scoreList) {
		this.scoreList = scoreList;
	}
	
	public void addScore(ScoreVO score) {
		scoreList.add(score);
	}
	
	@Override
	public String toString() {
		String str= "";
		str += "=================================\n";
		str += "번호 이름 java jsp spring 총점   평균   석차 \n";
		
		//석차 계산
		for(int i = 0 ; i<scoreList.size()-1 ;i++) {
			for(int j = i +1; j<scoreList.size(); j++) {
				if(scoreList.get(i).getTotal() > scoreList.get(j).getTotal()) {
					scoreList.get(j).setRank(scoreList.get(j).getRank()+1); 
				}else if (scoreList.get(i).getTotal()<scoreList.get(j).getTotal()) {
					scoreList.get(i).setRank(scoreList.get(i).getRank()+1); 
				}
			}	
		}
		
		for(ScoreVO vo : scoreList) {
			str += vo + "\n";
		}
		str += "=================================";
		return str;
	}
	

	
	
	
}
