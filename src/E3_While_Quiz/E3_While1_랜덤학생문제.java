package E3_While_Quiz;

import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */

public class E3_While1_랜덤학생문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		

		int cou = 0;
		int max = 0;
		int sum = 0;
		int rank = 1;
		double avg = 0;
		
		for(int i=1; i<=10; i++) {
			int num = ran.nextInt(100)+1;
			System.out.println(i + "번째 학생의 점수 : " + num);
			if(num >= 60) {
				cou += 1;
			}
			if(num > max) {
				rank = i;
				max = num;
			}
			sum += num;
			avg = sum / 10.0;
		}
		System.out.println("총합 : " + sum  + " 평균 :" + avg);
		System.out.println("합격자수 : " + cou);
		System.out.println("1등 번호 : " + rank + " 점수 : " + max);
	}
}
