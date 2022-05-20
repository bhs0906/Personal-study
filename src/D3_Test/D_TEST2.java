package D3_Test;

public class D_TEST2 {

	public static void main(String[] args) {
		// 문제 1) 과락
		// 3과목의 평균이 60점 이상이면, true
		// 단, 어느 한 과목이라도 50점 미만이면, false
		
		int kor = 100;
		int eng = 87;
		int math = 41;
		int avg = (kor+eng+math)/3;
		
		System.out.println(avg >= 60 && kor >= 50 && eng >= 50 && math >= 50);
		System.out.println("----------------------");
		
		// 문제 2) 국어가 100점이거나 수학이 100점이면 장학생(True) 출력.
		int 국어 = 99;
		int 수학 = 99;
		System.out.println(국어==100 || 수학 ==100);
		System.out.println("----------------------");
		
		//문제 3)  가로가 4이고 세로가 6인 삼각형 넓이가 짝수이면서 4의 배수이면 True 출력.	
		int 가로 = 4;
		int 세로 = 6;
		int sam = (가로 * 세로) / 2;
		
		System.out.println(sam%4 == 0);
		System.out.println("----------------------");
		
		//문제 4) 작년 연봉은 970 원이다 올해는 11 프로 인상이 되었다. 
		//      올해 우리 회사 평균 월급은 91 원이다. 
		//  	올해의  내연봉이 올해의 우리회사 평균 연봉보다 크면 True 출력 
		double 연봉  = 970 * 0.11;
		int 평균연봉 = 91*12;
		System.out.println(연봉 > 평균연봉);

		
		
		
	}

}
