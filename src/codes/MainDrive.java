package codes;

public class MainDrive {

	public static void main(String[] args) {

//		#2. 피보나치 수열을 출력하기
//		피보나치 수열 = An = A(n-1) + A(n-2)
//		이전 항 2개를 더한 값이 현재 항이 되는 수열
//		단 0번째 피보나치 수는 0, 1번째 피보나치 수는 1
//		ex) 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 

//		수열을 배열에 담자 일단 10칸짜리로 만듦
		int[] fibonacciArr = new int[100];

//		0번째 = 0 , 1번째 = 1로 초기화
		fibonacciArr[0] = 0;
		fibonacciArr[1] = 1;

//		2번째부터는 반복문을 이용
		for (int i = 2; i <= 10; i++) {
			fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
		}

//		출력 : 배열의 출력은 for-each
//		for (int i : fibonacciArr) {
//			System.out.print(fibonacciArr[i] + " ");
//	    }
//		출력값이 이상하게 나옴 0 1 1 1 2 5 21 0 0 ...

//		출력 다시
		for (int i = 0; i <= 10; i++) {
			System.out.print(fibonacciArr[i] + " ");
		}
		
		System.out.println();
		
		
//		또 다른 가능한 풀이
		int beforeBeforeNum = 0;
		int beforeNum = 1;
		
		System.out.print(beforeBeforeNum + " ");
		System.out.print(beforeNum + " ");
		
		for(int i = 2; i <= 10; i++) {
			
			int nNum = beforeNum + beforeBeforeNum;
			System.out.print(nNum + " ");
			
			beforeNum = nNum;
			beforeBeforeNum = beforeNum;
//			출력값이 틀림 : 0 1 1 2 4 8 16 32 64 128 256 왜그럴까
		
		}
		
	}

}
