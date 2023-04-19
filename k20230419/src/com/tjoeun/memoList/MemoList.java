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
	
	/*memoMain 클래스에서 호출되는  memoList라는  ArrayList에 저장할 데이터가 저장된
	memoVO클래스 객체를 넘겨받아 ArrayList에 저장되는 메소드*/
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
	}
	
	@Override
	public String toString() {
		
		String str = "";
		if(memoList.size() == 0 ) {
			System.out.print("저장된 글이 없습니다.");	
		} else {
			for(int i = memoList.size()-1 ; i>=0; i--) {
				str += memoList.get(i) + "\n";
			}
		}
		return str;
	}
	
	public MemoVO selectMemo(int idx) { //대부분 리턴이 없기 때문
		try {
			return memoList.get(idx -1);
		} catch (Exception e) {
			return null; 
		}
	}
	
	//삭제할 글 번호를 넘겨받고  memoList라는 ArrayList에 저장된 메모 1건을 삭제하는 메소드
	public void deletMemo(int idx) {
		memoList.remove(idx-1);
		/*
		- ArrayList는 데이터가 삽입될 경우 삽입되는 위치 이후의 데이터가 자동으로 다음으로 이동되고 데이터가 삭
		제될 경우 삭제되는 위치 이후의 데이터가 자동으로 앞으로 이동된다. 
		- 메모 삭제 후 인덱스가 변경되므로 인덱스에 맞춰서 글번호를 다시 붙여준다.
		- 이 현상은 데이터베이스를 사용하지 않고 ArrayList를 사용하기 때문에 발생되는 현상이다.
		- 메모 삭제 후 글번호를 다시 붙여준다.
		*/
		for(int i = 0 ; i<memoList.size() ; i++) {
			memoList.get(i).setIdx(i+1);
		}
		//글이 삭제된 후 새 글이 입력될 때 idx가 기존 idx값에 이어서 1씩 증가할 수 있도록  count의 값 수정
		MemoVO.count = memoList.size();
	}
	
	public void uqdateMemo(int idx, String memo) {	
		memoList.get(idx-1).setMemo(memo);
	}
}
