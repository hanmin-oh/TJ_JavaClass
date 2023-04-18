package com.tjoeun.memoList;

import java.util.ArrayList;
import java.util.Scanner;

public class MemoList {
	
	private ArrayList<MemoVO> memoList = new ArrayList<>();
	
	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}
	
	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}
	
	public void addMemo(MemoVO memo) {
		memoList.add(memo);
		
	}
	
	@Override
	public String toString() {
		
		String str = "";
		str += "입력하신 정보가 저장되었습니다.";
		for(int i = 0 ; i<memoList.size(); i++) {
			str += memoList.get(i) + "\n";
			
		}
		
		return str;
	}
	
}
