package E1_While_Quiz;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */

public class E1_While4_영수증문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		int cou = 0;				// 1,2,3 각 메뉴별 선택시 카운트 증가
		int cou1 = 0;
		int cou2 = 0;
		int money = 32000;
		
		int i = 1;
		while(i <= 5) {				// 5번 주문
			System.out.println("메뉴를 선택해주세요");
			int menu = scan.nextInt();
			
			if(menu == 1) {			// 1번 메뉴를 선택했다면 cou 카운트 1증가
				cou += 1;
			} else if(menu ==2) {
				cou1 += 1;
			} else if(menu ==3) {
				cou2 += 1;
			}
			i++;
		}
			int total = (price1 * cou) + (price2 * cou1) + (price3 * cou2); // 주문 총 금액
			System.out.println("총 금액은" + total + "입니다");
			System.out.println("지불 금액 : ");
			
			int pay = scan.nextInt();
			int a = money - total;
			
			if(a >= 0){					// 내가 낸 돈 - 총 금액이 0원 이상이면 결제 진행
				System.out.println("=== 롯데리아 영수증 ===");
				System.out.println("1. 불고기 버거 : " + cou + "개");
				System.out.println("2. 새우버거 : " + cou1 + "개");
				System.out.println("3. 콜라 : " + cou2 + "개");
				System.out.println("4. 총 금액 : " + total + "원");
				System.out.println("5. 잔돈 : " + a + "원");
			} else {
				System.out.println("현금이 부족합니다.");
			}
	}
}
