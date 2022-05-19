package D2_if_Quiz;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */

public class D2_if4_최대값문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요");
		int a = scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int b = scan.nextInt();
		System.out.println("세번째 숫자를 입력해주세요");
		int c = scan.nextInt();
		
		int max = a;
		if(max < b) {
			max = b;			
		}
		if(max < c) {
			max = c;
		}
		System.out.println("입력한 숫자 3개중 큰수는 " + max + " 입니다");

		

	}

}
