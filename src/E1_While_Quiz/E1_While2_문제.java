package E1_While_Quiz;

import java.util.Random;

public class E1_While2_문제 {

	public static void main(String[] args) {
		//문제1) 1~5까지의 합 출력 ==> 
				//		 1 + 2 + 3 + 4 + 5
				// 정답 1) 15
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("-------------------");

        //문제2) 1~10까지 반복해 3미만 7이상만 출력  ==> 
      	//       1,2,7,8,9,10       
        
		int a = 1;
		while(a <= 10) {
			if(a < 3 || a >= 7) {			// a가 3보다 작거나 a가 7이나 7보다 높을경우 
				System.out.print(a + " ");
			}		
			a++;
		}
		System.out.println();
	    System.out.println("-------------------");	
		
		//문제3) 1~10까지 중에서 3미만 7이상의 합출력  ==>
		//      1 + 2 + 7 + 8 + 9 + 10
		int sum1 = 0;	    
		int b = 1;
		while(b <= 10) {
			if(b < 3 || b >= 7) {			// b가 3보다 작거나 b가 7이나 7보다 높을경우 
				sum1 += b;					// sum1 + b 실행
			}		
			b++;
		}
		System.out.printf(sum1 + " ");
		System.out.println();
	    System.out.println("-------------------");
	    
	    //문제4) 1~10까지 중에서 3미만 7이상의 개수 출력 ==> 
	  	//		 1,2,7,8,9,10 ==> 6개
	    
		int num = 0;	    
		int c = 1;
		while(c <= 10) {
			if(c < 3 || c >= 7) {			// c가 3보다 작거나 c가 7이나 7보다 높을경우 
				num +=1;				// 1 2 7 8 9 10 총 6개가 출력되기때문에 돌아가는동안 num + 1을 해주면 6번돌아서 멈춤
			}		
			c++;
		}	    
		System.out.println(num);
	    System.out.println("-------------------");
		
		//문제 5) 랜덤으로 숫자 (1~5) 2개 저장한다. 
		// 		 작은수에서 큰수까지 1씩 증가하면서 출력
		//  	 1,4  ==> 1,2,3,4
		// 		 3,1  ==> 1,2,3 
		//  	 5,5  ==> 5
		Random ran = new Random();
		int max = ran.nextInt(5)+1;
		int min = ran.nextInt(5)+1;
		
		System.out.print("랜덤값 : " + max + " ");
		System.out.print(min);
		System.out.println();
	    System.out.println("===================");
		
		if(max < min) {				
			int val = max;				// 값을 서로 교환해주기 위해서는 중간 매체의 변수가 필요하다 / max = min으로 서로 교환할수없음
			max = min;					
			min = val;
		} 
		while(max >= min){				// 맥스가 민보다 크거나 같다면	
			System.out.print(min + " "); 
			min++;
								// 제일작은 민 값이 맥스값과 같아질때까지 증가시킨다
			// ex) min = 2 / max = 4라고 가정하면 민값 2가 while문에서 내려갔다가
			// ++해서 3으로 다시 while로 올라갔다가 내려와서 4가됨
			// 4에서 다시 while로 올라갔다가 내려와서 ++로 5까지 생성은 되지만 조건만족으로 더이상 
			// while문 아래로 내려오지 않기때문에
		}
	}
}


