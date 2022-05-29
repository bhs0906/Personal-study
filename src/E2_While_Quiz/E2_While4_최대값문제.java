package E2_While_Quiz;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 1. 반복횟수를 입력받는다. 
 * 2. 입력받은 반복횟수만큼 숫자를 입력받고 
 * 3. 입력받은 숫자 중 가장 큰 값을 출력한다.
 */

public class E2_While4_최대값문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("반복하려는 횟수를 입력하세요 : ");
		
		int ban = scan.nextInt();

		int max = 0;
		int cou = 1;
		int i = 0;
		while(i < ban) {
			System.out.println("=======================");
			System.out.println(cou + "번째 입력입니다.");
			System.out.printf("숫자를 입력해주세요 : ");
			int ban1 = scan.nextInt();
			
				if(max < ban1) {
					max = ban1;
				}
			cou ++;
			i++;
		}
		System.out.println("=======================");
		System.out.println("입력받은 숫자중 가장 큰 값은 : " + max + " 입니다");
	}
}
