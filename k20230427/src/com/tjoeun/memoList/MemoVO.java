package com.tjoeun.memoList;

import java.text.SimpleDateFormat;
import java.util.Date;

//메모 한건을 기억할 클래스
public class MemoVO {
	
	/* 클래스의 필드 이름은 데이터베이스 테이블에 정의 필드 이름, html의
	태그 요소의 name 속성에 정의한 이름과 반드시 같은 이름으로 만든다. */
	
	private int idx;
	private String name;
	private String password;
	private String memo;
	private Date writeDate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	@Override
	public String toString() {
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm"); //오늘
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)"); //어제 이전
		
		/* if(date.getYear() == writeDate.getYear() &&  date.getMonth() == 
				writeDate.getMonth() && date.getDate() == writeDate.getDate() ) {
			str += sdf1.format(writeDate);
		} else {
			str += sdf2.format(writeDate);
		}
		return String.format("%d. %s(%s)님이 %s에 남긴글\n%s", idx, name, password, str, memo); */
		
		boolean isToday = date.getYear() == writeDate.getYear() &&  date.getMonth() == 
			writeDate.getMonth() && date.getDate() == writeDate.getDate();
		return String.format("%d. %s(%s)님이 %s에 남긴글\n%s", idx, name, password, 
			(isToday ? sdf1 : sdf2).format(writeDate), memo);
	}
}
