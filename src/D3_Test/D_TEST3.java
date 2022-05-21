package D3_Test;


//[문제1] 50000원 을 가지고 철수와 영희는 같이 영화 1편을 보고 팝콘1개와 콜라 2개를 사먹었다.
//남은돈은 얼마인가? 

//[힌트] 
//콜라1개는 팝콘1개 보다 4000원 싸다.
//영화 1편의 가격은 12000 원이다.
//팝콘의 가격은 영화의 10/6 가격이다. 

public class D_TEST3 {

	public static void main(String[] args) {
		
		int money = 50000;
		int movie = 12000;
		double popcon = movie * 0.6;
		double cola = popcon - 4000;

		System.out.println(money-(((movie*2)-popcon)-(cola*2)));
		System.out.println("-------------------------");
		
		// [문제2] 2만원을 가지고 친구3명과  돈까스를 각각 1개씩  사먹었더니 남은돈이 2000원이였다. 
	    // 돈까스를 의 가격은 얼마인가? 
		
		int money1 = 20000;
		int don = (money1-2000)/3;
		
		System.out.println(don);
		System.out.println("-------------------------");		
		// [문제3] 123123초 는 몇시간 몇분 몇초인가 ?
		int cho = 123123;
		int cho1 = cho%60;
		int bun = (cho/3600)%60;
		int si = cho/3600;
		
		System.out.println(si+"시"+bun+"분"+cho1+"초");
		
		int a = 3%10;
		System.out.println(a);

	}

}
