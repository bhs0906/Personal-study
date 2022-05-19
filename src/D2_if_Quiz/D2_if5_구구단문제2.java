package D2_if_Quiz;

import java.util.Random;
import java.util.Scanner;

//추가문제 ) 구구단문제를 랜덤으로 바꿔보자. 입력은 직접 

public class D2_if5_구구단문제2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		Random ran = new Random();
		
		int ran1 = ran.nextInt(8) + 2; 	//0~7 + 2 ==> 2~9
		int ran2 = ran.nextInt(9) + 1;  //0~8 + 1 ==> 1~9
		
		System.out.println(ran1 + "*" + ran2 + "= 몇일까요?");
		
		int jung = scan.nextInt();
		int dap = ran1*ran2;
		if(jung == dap)
			System.out.println("정답");
		if(jung != dap)
			System.out.println("땡");	
	}

}
