package D4_if_Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 1번
 */

public class D4_if5_연산자기호문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ran1 = ran.nextInt(10)+1;
		int ran2 = ran.nextInt(10)+1;
		int dap = ran.nextInt(4)+1;
		
		int kk = 0;
		if(dap == 1) {
			kk = ran1 + ran2;
		}
		else if(dap == 2) {
			kk = ran1 - ran2;
		}
		else if(dap == 3) {
			kk = ran1 * ran2;
		}
		else if(dap == 4) {
			kk = ran1 / ran2;
		}
		
		System.out.println(ran1 + " ? " + ran2 + " = " + kk);
		System.out.println("1)+ 2)- 3)* 4)%");
		
		System.out.print("?에 들어갈 기호를 선택하세요 : ");
		int dap1 = scan.nextInt();
		
		if ( dap == dap1) {
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
	}
}
