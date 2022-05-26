package E2_While_Quiz;


public class E2_While2_응용문제 {

	public static void main(String[] args) {
		//문제4) 50에서 100까지 자연수중에서 
		//9의 배수의 개수를 출력  # 답 : 6 (54,63,72,81,90,99)
		
		int num = 50;
		int cou = 0;
		while(num <= 100) {
			if(num % 9 == 0) {
				cou +=1;
			}
			num += 1;
		}
		System.out.println("답 : " + cou);
		
		
		//문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 
		//답 : 980 
		
		num = 28;
		int max = num;
		int a = 0;
		while(a == 0) {
			if(max > 1000) {
				System.out.println(num);
				a = 1;			
			} else {
				num = max;
				max += 28;
			}
		}
		
		//문제6) 8의 배수를 작은수부터 4개 출력 
		//답 : 8,16,24,32
		
		num = 8;
		int cou1 = 0;
		a = 0;
		while(a <= 4) {
			if(num % 8 == 0) {
				System.out.printf(num + " ");
				cou1 += 1;
			}
			if(cou1 == 4) {
				break;
			}
			num = num + 8;
		}
	}
}
