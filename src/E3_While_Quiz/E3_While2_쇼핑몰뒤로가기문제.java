package E3_While_Quiz;

import java.util.Scanner;

/*
 * # 쇼핑몰 뒤로가기
 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
 *      뒤로가기 누르기전까지 남성의류 페이지 를 유지할려고한다.
 * 힌트) 개층 별로 반복문을 추가 해주면된다. 
 * 1. 남성의류
 * 		1) 티셔츠
 * 		2) 바지
 * 		3) 뒤로가기
 * 2. 여성의류
 * 		1) 가디건
 * 		2) 치마
 * 		3) 뒤로가기
 * 3. 종료
 */

public class E3_While2_쇼핑몰뒤로가기문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 1;
		while(a == 1) {
			System.out.println("===== 쇼핑몰 메인 =====");
			System.out.println("1. 남성의류");
			System.out.println("2. 여성의류");
			System.out.println("3. 종료");
			int num = scan.nextInt();
			
				if(num == 1) {
					int b = 1;
					while(b == 1) {
						System.out.println("===== 남성의류 =====");
						System.out.println("1) 티셔츠");
						System.out.println("2) 바지");
						System.out.println("3) 뒤로가기");
						int num1 = scan.nextInt();
						if(num1 == 3) {
							System.out.println("뒤로갑니다");
							break;
						}
					}
				} else if(num == 2){
					System.out.println("===== 여성의류 =====");
					System.out.println("1) 가디건");
					System.out.println("2) 치마지");
					System.out.println("3) 뒤로가기");	
				} else {
					System.out.println("종료합니다");
					break;
				}
		}
	}
}
