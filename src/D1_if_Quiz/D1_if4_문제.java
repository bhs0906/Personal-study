package D1_if_Quiz;

import java.util.Scanner;

public class D1_if4_문제 {

	public static void main(String[] args) {
		/*
		 * # 로그인[1단계]
		 * 1. Id와 Pw를 입력받는다.
		 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id를 입력하세요");
		int id = scan.nextInt();
		System.out.println("pw를 입력하세요");
		int pw = scan.nextInt();
		
		if(id == dbId  && pw == dbPw)
			System.out.println("로그인 성공");
		if(id != dbId  && pw != dbPw)
			System.out.println("로그인 실패");
		
		
	}

}
