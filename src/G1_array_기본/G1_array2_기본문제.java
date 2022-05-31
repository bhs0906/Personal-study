package G1_array_기본;

public class G1_array2_기본문제 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		// 문제1) 4의 배수만 출력
		// 정답1) 20 40		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("=============");
		
		// 문제2) 4의 배수의 합 출력
		// 정답2) 60
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		System.out.println("=============");
		
		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2
		
		int cou = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cou += 1;
			}
		}
		System.out.println(cou);
		
	}

}
