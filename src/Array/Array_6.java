package Array;

import java.io.*;
/*
	▣ 입력예제 1
	9
	32 55 62 20 250 370 200 30 100
	▣ 출력예제 1
	23 2 73 2 3
*/

public class Array_6 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String []str = br.readLine().split(" ");
		StringBuffer sb = new StringBuffer();
		int temp = 0;
		String result = new String();
		
		for(int i = 0; i < a; i++) {
			temp = Integer.parseInt(sb.append(str[i]).reverse().toString());
			
			if(checkPrime(temp)) {
				result += temp + " ";
			}
			
			sb.delete(0, sb.length());
		}
		System.out.println(result);
	}
	
	static boolean checkPrime(int a) {
		if(a < 2) return false;
		
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) return false;
		}
		return true;
	}
}
