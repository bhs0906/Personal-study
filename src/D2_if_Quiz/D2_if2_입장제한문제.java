package D2_if_Quiz;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */
public class D2_if2_입장제한문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키를 입력하세요");
		int ki = scan.nextInt();
		
		if(ki >= 120) 
			System.out.println("놀이기구에 탑승하세요");
		if(ki < 120)
			System.out.println("부모님과 함께 오셨나요? => yes = 1 / no = 0 ");
		
		int bu = scan.nextInt();


		if(bu == 1)
			System.out.println("부모님과 함께 탑승하세요");
		if(bu == 0)
			System.out.println("탑승할 수 없습니다");
		
		

	}

}
