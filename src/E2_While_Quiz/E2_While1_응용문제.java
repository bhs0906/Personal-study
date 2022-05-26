package E2_While_Quiz;

public class E2_While1_응용문제 {

	public static void main(String[] args) {
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력
		//==> 답 : 36		
		int num = 9;
		int run = 1;
		while(run == 1) { 				// run == 1은 정답이 나올때까지 무한반복
			int 일 = num % 10;			// %10을 해줘야 일의 자리만 나타낼수있음
			if(일 == 6) {				// 일의 자리가 6과 같을경우 종료
				System.out.println("num : " + num);
				run = 0;
			}			
			num += 9;					// 한번돌때마다 9씩 증가
		}
		
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 
		//==> 답 : 63
		num = 9;
		run = 1;
		while(run == 1) {
			int 십 = num / 10;
			if(십 == 6) {
				System.out.println("num : " + num);
				run = 0;
			}
			num += 9;
		}	
		//문제3) 8의 배수중  150보다 작고 150 에 
		//가장 가까운수를 출력 ==> 답 : 144
		num = 8;
		run = 1;
		while(run == 1) { 				
			int 가 = num / 10;			
			if(가 == 14) {				
				System.out.println("num : " + num);
				run = 0;
			}			
			num += 8;					
		}
	}
}
