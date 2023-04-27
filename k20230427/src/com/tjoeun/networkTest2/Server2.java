package com.tjoeun.networkTest2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
	
	public static void main(String[] args) {
		
		ServerSocket server = null; 
		Socket socket = null; 
		PrintWriter printWriter = null; 
		Scanner scanner = null; //클라이언트에서 전송되는 메시지를 읽는 스캐너
		Scanner scan = null; //클라이언트로 전송한 메시지를 입력받는 스캐너
		
		try {
			server = new ServerSocket(10004);
			System.out.println("서버 시작: " + server);
			System.out.println("클라이언트 접속 대기");
 			socket = server.accept();
 			
 			printWriter = new PrintWriter(socket.getOutputStream());
 			scanner = new Scanner(socket.getInputStream());
 			scan = new Scanner(System.in);
 			
 			printWriter.write("클라이언트님 어서오세요 ^^~ \n");
 			printWriter.flush();
 			
 			//키보드로 입력한 메시지 또는 클라이언트에서 전송받은 메시지가 "BYE"면 통신을 끝낸다.
 			String msg = "";
 			do {
 				//클라이언트에서 전송받은 메시지를 출력한다.
 				msg = scanner.nextLine();
 				System.out.println("client >> " + msg );
 				//클라이언트에서 전송받은 메시지가 "BYE"면 통신을 종료한다.
 				if(msg.toUpperCase().equals("BYE")) {
 					break;
 				}
 				//---------------------------------------------------------// 서버쪽으로 보낸 것
 				//클라이언트로 전송할 메시지를 입력받는다.
 				System.out.println("server >> ");
 				msg = scan.nextLine().trim();
 				//입력받은 메시지를 클라이언트로 전송한다.
 				printWriter.write(msg + "\n");
 				printWriter.flush();
 				//입력한 메시지가 "BYE"면 통신을 종료한다. => do ~ while을 탈출한다.
 			} while (!msg.toUpperCase().equals("BYE"));
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			//클라이언트와 통신이 종료되면 통신에 사용한 ServerSocket, Socket 객체를 닫는다.
			if(socket != null) { try { socket.close(); } catch (IOException e) { e.printStackTrace(); } } 
			if(server != null) { try { server.close(); } catch (IOException e) { e.printStackTrace(); } }
		}
	}
}
