package D1_if_Quiz;

import java.util.Scanner;

public class D1_if5_문제 {

	public static void main(String[] args) {
		/*
		 * # 회원가입 과 로그인 
		 * 1. 먼저 아이디와 비밀번호를 입력해서 회원가입한다. 
		 * 2. 이후 로그인을 위해 다시 아이디와 비밀번호를 입력받는다.
		 * 3. 가입된 아이디와 비번과 로그인시 입력한 아이디와 비밀번호를 비교한다. 
		 * 예) 로그인 성공 or 로그인 실패
		 */
		
		Scanner scan = new Scanner(System.in);		
		int dbId = 5632;
		int dbPw = 1234;	
		
		System.out.println("가입하시려는 id를 입력하세요");
		dbId = scan.nextInt();
		System.out.println("가입하시려는 pw를 입력하세요");
		dbPw = scan.nextInt();
		System.out.println("가입완료.");
		
		System.out.println("**로그인 창입니다**");
		System.out.println("id를 입력하세요");
		int id = scan.nextInt();
		System.out.println("pw 입력하세요");
		int pw = scan.nextInt();
		
		if(id == dbId && pw == dbPw) {
			System.out.println("로그인 성공");
		}
		if(id != dbId || pw != dbPw) {
			System.out.println("로그인 실패");
		}		
	}

}
