package D4_if_Quiz;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class D4_if3_369문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int ran1 = ran.nextInt(50)+1;
		

		int num1 = ran1/10;
		int num2 = ran1%10;
		
		System.out.printf("랜덤값 출력 : %d", ran1);
		System.out.println();
		System.out.println("---------------");
		
		int num3 = 0;
		
		if(num1 == 3 || num1 == 6 || num1 == 9) {
			num3 += 1;
		}
		if(num2 == 3 || num2 == 6 || num2 == 9) {
			num3 += 1;
		}
		
		if(num3 == 2) {
			System.out.println("짝짝");
		} else if(num3 == 1) {
			System.out.println("짝");
		} else {
			System.out.println(ran1);
		}

	}

}
