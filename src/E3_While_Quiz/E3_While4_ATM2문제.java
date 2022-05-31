package E3_While_Quiz;

import java.util.Scanner;

//문제가 이상함

/*
 * # ATM
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * 3. 프로그램 종료
 */

public class E3_While4_ATM2문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;		
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
            System.out.println("3.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("아이디를 입력하세요");
				int id = scan.nextInt();
				System.out.println("비밀번호를 입력하세요");
				int pw = scan.nextInt();
				if(id == 1111 && pw == 1234){
					System.out.println("dbAcc1 아이디로 로그인 하였습니다");
					break;
				} else if(id == 2222 && pw == 2345){
					System.out.println("dbAcc2 아이디로 로그인 하였습니다");
					break;
				} else {
					System.out.println("아이디와 비밀번호를 다시 확인해주세요");
				}
			}
			else if(sel == 2) {
				System.out.println("로그아웃 되었습니다.");
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}
