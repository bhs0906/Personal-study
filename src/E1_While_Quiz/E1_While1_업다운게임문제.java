package E1_While_Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. com 은 랜덤으로 1~100사이를 저장한다.
 * 2. me 는 1~100사이를 입력한다. 	 
 * 3. com 과 me 를 비교해서 com 크면 "크다" , 
 * 	  com 이작으면 "작다" 힌트제공 
 * 4. 정답을 맞추면 게임은 종료된다.
 */

public class E1_While1_업다운게임문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int me = ran.nextInt(100)+1;
		System.out.println("1~100사이의 숫자를 입력하세요");
		int com = scan.nextInt();
		
		while(me > com) {
			System.out.println(me);
			System.out.println("크다");
			break;
			}
		while(me < com) {
			System.out.println(me);
			System.out.println("작다");
			break;
		}
	}
}

