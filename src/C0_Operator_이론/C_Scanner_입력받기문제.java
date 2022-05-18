package C0_Operator_이론;

import java.util.Scanner;

// 문제 1) 숫자 2개를 입력받아, 합 출력

// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		
// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력

public class C_Scanner_입력받기문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1 입력");
		int a = scan.nextInt();
		System.out.println("숫자2 입력");
		int b = scan.nextInt();
		
		int sum = a + b;
		System.out.println("합계는 =" + sum);
		
		System.out.println("숫자1 입력");
		int c = scan.nextInt();
		System.out.println(c % 2 == 1);
		
		System.out.println("성적 입력");
		int d = scan.nextInt();
		System.out.println(60<= c && c<=100);
		
		
		
		
		
		
	}
}