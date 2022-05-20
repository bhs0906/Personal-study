package D3_Test;



public class D_TEST1 {

	public static void main(String[] args) {
		/*
		#   운주네 반 학생은 31명입니다.
		#   이중에서 남학생은 7명 , 여학생은 14명이 봉사할동을 하였습니다.
		// 문제1) 봉사할동을 한학생들의 합이 홀수이고 , 봉사할동은 하지않은 학생수가 홀수이면 True 출력.
		*/
		int total = 31;
		int boy = 7;
		int girl = 14;		
		int bong = boy + girl;
		int bongx = total - bong;
		
		if (bong%2 == 1 && bongx%2 ==1 ) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
		System.out.println("---------------------------");
		
		/*
		# 연필 7타를 여학생 3명과 남학생 4명에게 남김없이 똑같이 나누어 주었다.
		# (연필 1타는 12자루)
		// 문제2) 여학생들이 받은 연필갯수가 3의 배수이고  남학생들이 받은 연필갯수가 4의 배수면 True 출력.
		*/
		
		int girls = 3;
		int boys = 4;
		int pen = 12 * 7;
		int pen1 = pen / 7;
		int total1 = boys * pen1;
		int total2 = girl * pen1;
		
		if (total1%3 == 0 && total2%4 == 0) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
		System.out.println("---------------------------");			
		/*
		# 문제3)
		# 귤 6개의 무개는 840g, 사과 3개의 무게는 750g 입니다.
		# 귤5개의 무게가 4의 배수이고  사과 4개의 무게가 5의 배수이면 True 출력.
		*/
		
		int gul = 840 / 6;
		int apple = 750 / 3;
		int gul1 = gul * 5;
		int apple1 = apple * 4;
		
		if(gul1%4 == 0 && apple1%5 == 0) {
			System.out.println("True");			
		} else {
			System.out.println("false");
		}
	}

}
