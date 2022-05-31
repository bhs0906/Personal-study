package G1_array_기본;

// 문제1) 10부터 50까지 arr 배열에 저장
// 정답1) 10 20 30 40 50

// 문제2) 전체 합 출력
// 정답2) 150

public class G1_array1_기본문제 {

	public static void main(String[] args) {
//		int[] arr = {}; 			   선언과 동시에 값을 넣는방법
		
		int arr[];
		arr = new int[] {10,20,30,40,50};			// new 연산자로 값과 함께 넣는 방법
		
//		int arr[] = new int[5];		// new연산자로 바로 선언하는 방법(많이 쓰임)
//		
//		for(int i = 0; i<=arr.length; i++) {
//			arr[i] = (i+1)*10;
//			System.out.println(arr[i]);
//		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			System.out.println("==========");	
			
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
			System.out.println(sum);
	}

}
