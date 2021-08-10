package codes;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		#2. 피보나치 수열을 출력하기
//		피보나치 수열 = An = A(n-1) + A(n-2)
//		이전 항 2개를 더한 값이 현재 항이 되는 수열
//		단 0번째 피보나치 수는 0, 1번째 피보나치 수는 1
//		ex) 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
		
//		수열을 배열에 담자 일단 100칸짜리로 만듦
		int[] fibonacciArr = new int[100];
		
//		0번째 = 0 , 1번째 = 1로 초기화
		fibonacciArr[0] = 0;
		fibonacciArr[1] = 1;
		
//		2번째부터는 반복문을 이용
		for(int i = 2; i <= fibonacciArr.length; i++) { 
			fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];
		}
	}

}
