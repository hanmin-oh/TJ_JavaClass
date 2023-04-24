package com.tjoeun.interfaceTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class UserInfoClient {
	
	public static void main(String[] args) {
		
		String dbType = "";
		
		//FileInputStream 클래스는 파일에서 바이트 단위로 데이터를 읽어온다.
		FileInputStream fis = null;
		try {
			/* - FileInputStream 클래스 생성자의 인수로 읽을 파일의 경로와 이름을 넘겨주면 파일을 읽어온다.
			 -FileInputStream 클래스 생성자의 인수로 읽을 파일의 이름만 넘겨주면 프로젝트 이름의 폴더(k20240424)에서
			 파일을 읽어온다. */
			String filepath = ".\\src\\com\\tjoeun\\interfaceTest2\\db.properties";
			fis = new FileInputStream(filepath);
			
			/*read() 메소드는 FileInputStream 클래스 객체에서 1바이트의 데이터를 읽어오기 때문에 형변환 후 문자출력
			int ch;
			String prop = "";
			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
				prop += (char) ch;
			}
			System.out.println("\n" + prop);
			System.out.println(Arrays.toString(prop.split("=")));
			출력 결과  	DBTYPE=MYSQL
						DBTYPE=MYSQL
						[DBTYPE, MYSQL]  */
			
			//Properties zmffotmsms FileInputStream 객체로 읽어들인 properties 파일의 데이터를 읽어온다. 
			Properties properties = new Properties();
			//load() 메소드는 FileInputStream 객체 properties 파일을 읽어온다.
			properties.load(fis);
			
			/* - getProperty()메소드로 인수로 지정된 properties 파일의 key("=" 왼쪽 부분)에 해당되는 value("=" 오른쪽 부분)을 얻어온다.
			 - getProperty() 메소드의 2번째 인수로 properties 파일에 key가 존재하지 않은 경우 사용할 기본값을 지정할 수 있다.  
			 System.out.println(properties.getProperty("DBTYPE")); //출력 : MYSQL
			 System.out.println(properties.getProperty("DBTYPE" , "없음")); //출력 : MYSQL
			 System.out.println(properties.getProperty("DBTYPE1")); //출력 : null,,DBTYPE은 있지만 DBTYPE1이 없다.
			 System.out.println(properties.getProperty("DBTYPE1", "없음")); //출력 : 없음   */
			dbType = properties.getProperty("DBTYPE" , "없음");
			System.out.println("DBTYPE: " + dbType);
			
		} catch (FileNotFoundException e) {
			System.out.println("디스크에 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("디스크에 파일이 존재하지 않습니다.");
		}
		
		UserInfoVO vo = new UserInfoVO();
		vo.setUserID("qwert");
		vo.setUserName("이순신");
		vo.setUserPassword("12345");
		System.out.println(vo);
		
		UserInfoDAO dao = null; //인터페이스를 안쓰면 조건문에 중복되어 실행해야 한다.
		if(dbType.equals("MYSQL")) {
			dao = new UserInfoMysqlDAO();
		} else if (dbType.equals("ORACLE")){
			dao = new UserInfoOracleDAO();
		} else {
			System.out.println(dbType + "은(는) 지원되지 않는 데이터베이스입니다.");
			return; //리턴값 만나면 메소드는 종료(void이기 때문에 리턴값 없음)
		}
		
		dao.insertUserInfo(vo);
		dao.updateUserInfo(vo);
		dao.deleteUserInfo(vo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
