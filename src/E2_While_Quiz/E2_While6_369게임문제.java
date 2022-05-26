package E2_While_Quiz;

import java.util.Scanner;

/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
   3. 숫자에 3,6,9가 하나이면 "짝" 
   4. 숫자에 3,6,9가 두개이면 "짝짝"
   5. 이외숫자는 그냥 숫자출력 
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */

public class E2_While6_369게임문제 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 50) {
			
			int x = i / 10;
			int y = i % 10;
			
			int cnt = 0;
			if(x != 0 && x % 3 == 0) {				// x가 0이 아니거나 3으로 나눈 나머지가 0일경우
				cnt = cnt + 1;						// 카운트 1 증가
			}
			if(y != 0  && y % 3 == 0) {				// x가 0이 아니거나 3으로 나눈 나머지가 0일경우
				cnt = cnt + 1;						// 카운트 1 증가
			}
			
			if(cnt == 2) {							// 카운트가 2일경우
				System.out.println("짝짝");
			}
			else if(cnt == 1) {						// 카운트가 1일경우
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}
			
			i += 1;
		}
		

		
	}

}