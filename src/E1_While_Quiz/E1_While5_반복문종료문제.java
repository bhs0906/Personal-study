package E1_While_Quiz;

import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 * 예)
 * 숫자 입력[EXIT:-100] : 1
 * 숫자 입력[EXIT:-100] : 3
 * 숫자 입력[EXIT:-100] : 4
 * 숫자 입력[EXIT:-100] : -100
 * 프로그램 종료
 */

public class E1_While5_반복문종료문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 1;
		while(a == 1) {
			System.out.println("숫자를 입력해주세요");
			System.out.println("-100을 입력하시면 종료됩니다");
			int num = scan.nextInt();
			
			
			if(num == -100) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

}
