package Array;

import java.util.Scanner;

/*
	20이 입력되면 1부터 20까지의 소수는 
	2, 3, 5, 7, 11, 13, 17, 19로 총 8개
	
	▣ 입력예제 
	20
	▣ 출력예제
	8
	https://st-lab.tistory.com/81 여기서 참고함.
*/
public class Array_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int result = 0;
		
		for(int i = 2; i <= a; i++) {
			if(checkPrime(i)) {
				result++;
			}
		}
		System.out.println(result);
	}
	
	static boolean checkPrime(int a) {
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {
				return false;
			}
		}
//		System.out.println("소수 = " + a);
		return true;
	}
}

/* 
	n = p * q 일 때
	제곱근을 쓴 이유는 만약 16이 소수인지를 판단한다 했을 때
	1 * 16
	2 * 8
	4 * 4
	8 * 2
	16 * 1
	p가 커지면 q가 줄어들어 이를 잘이해하면된다.
 */
