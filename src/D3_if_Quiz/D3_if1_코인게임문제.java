package D3_if_Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class D3_if1_코인게임문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int ran1 = ran.nextInt(2);
		
		System.out.println("동전의 앞면(0) 뒷면(1)중에 선택해주세요");
		int scan1 = scan.nextInt();
		
		if(ran1 == scan1)
			System.out.println("빙고");		
		if(ran1 != scan1)
			System.out.println("땡");	
		
		if(ran1 == 0)
			System.out.println("결과는 앞면입니다");		
		if(ran1 == 1)
			System.out.println("결과는 뒷면입니다");			
	}

}
