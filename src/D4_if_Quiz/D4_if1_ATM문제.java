package D4_if_Quiz;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class D4_if1_ATM문제 {

	public static void main(String[] args) {
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계좌번호를 입력하세요");
		int ho = scan.nextInt();
		
		if(ho == yourAcc) {
			System.out.println("이체할 금액을 입력하세요");
			int money = scan.nextInt();
		if(money <= myMoney) {
			System.out.println("이체하였습니다.");
			myMoney = myMoney - money;
			yourMoney = yourMoney + money;
			System.out.println("myMoney = " + myMoney + "원");
			System.out.println("yourMoney = " + yourMoney + "원");
		} else {
			System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("계좌 번호를 확인해주세요");
		}
	}
}
