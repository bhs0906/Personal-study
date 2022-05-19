package D2_if_Quiz;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */
//	int price1 = 8700;
//	int price2 = 6200;
//	int price3 = 1500;
//
//	System.out.println("=== 롯데리아 ===");
//	System.out.println("1.불고기 버거 : " + price1 + "원");
//	System.out.println("2.새우    버거 : " + price2 + "원");
//	System.out.println("3.콜         라 : " + price3 + "원");
public class D2_if3_영수증문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우 버거 : " + price2 + "원");
		System.out.println("3.콜라 : " + price3 + "원");
		
		System.out.println("메뉴를 선택해주세요");
		int menu = scan.nextInt();
		
		
		if(menu == 1) {
			System.out.println("불고기 버거를 선택하셨습니다");
			System.out.println("돈을 지불해주세요");
			int money = scan.nextInt();
			if(money >= price1)
			System.out.println("잔액은" + (money - price1) + "원 입니다.");
			if(money < price1)
			System.out.println("금액이 부족합니다.");
		}
		if(menu == 2) {
			System.out.println("새우 버거를 선택하셨습니다");
			System.out.println("돈을 지불해주세요");
			int money = scan.nextInt();
			if(money >= price1)
				System.out.println("잔액은" + (money - price2) + "원 입니다.");
			if(money < price1)
				System.out.println("금액이 부족합니다.");
		}
		if(menu == 3) {
			System.out.println("콜라를 선택하셨습니다");
			System.out.println("돈을 지불해주세요");
			int money = scan.nextInt();
			if(money >= price1)
				System.out.println("잔액은" + (money - price3) + "원 입니다.");
			if(money < price1)
				System.out.println("금액이 부족합니다.");
		}	
		if(menu < 1 || menu > 3) {
			System.out.println("없는 메뉴입니다");			
		}
	}

}
