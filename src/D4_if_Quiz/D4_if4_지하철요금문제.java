package D4_if_Quiz;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class D4_if4_지하철요금문제 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("정거장 수를 입력해주세요");
		int st = scan.nextInt();
		
		int money = 0;
		int add = 0;
		if(st >= 1 && st <= 5) {
			money = 500;
		} else if(st >= 6 && st <=10){
			money = 600;
		} else if(st > 10){
			money = 600;
			st = st-10;                 // 기본료인 10정거장은 일단 제외시켜줌
			add = st / 2 * 50;			// 11정거장은 -10해서 1일경우 0/2 = 0이되고 0 * 50은 0이됨
										// 13정거장은 -10해서 3일경우 3/2 = 1.5가 내림으로 1이 되고 1 * 50 은 50이됨
			if(st % 2 > 0) {
				add = add + 50;
			}
			
		}	
		System.out.println("요금은 " + (money + add) + "원 입니다");
	}
}
