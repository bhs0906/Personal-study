package D3_if_Quiz;

import java.util.Random;

/*
 * # 가위(0)바위(1)보(2) 게임[2단계] 
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다. 
 * 3. com과 me를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
 */

import java.util.Scanner;

public class D3_if3_가위바위보문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("가위(0) 바위(1) 보(2) 중에 숫자로 선택하세요");
		int me = scan.nextInt();		
		int com = ran.nextInt(3);

		// 0이 2를 이김 0이 1한테 짐
		// 1이 0을 이김 1이 2한테 짐
		// 2가 1을 이김 2가 0한테 짐
		
		System.out.println(com);
		if(me == 0 && com == 2)
			System.out.println("이겼다");
		if(me == 1 && com == 0)
			System.out.println("이겼다");
		if(me == 2 && com == 1)
			System.out.println("이겼다");
		if(me == 0 && com == 1)
			System.out.println("졌다");
		if(me == 1 && com == 2)
			System.out.println("졌다");
		if(me == 2 && com == 0)
			System.out.println("졌다");
		if(me == com)
			System.out.println("비겼다");
		if(me < 3 && com == 4)
			System.out.println("다시 입력해주세요");
	
	}

}
