package D2_if_Quiz;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */

public class D2_if5_구구단문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요");
		int gu1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int gu2 = scan.nextInt();
		
		System.out.println(gu1 + "X" + gu2 + " = 몇 일까요?");
		int jung = scan.nextInt();
		
		
		int dap = gu1*gu2;
		if(jung == dap) 
			System.out.println("정답");			
		if(jung != dap)
			System.out.println("땡");
	}

}
