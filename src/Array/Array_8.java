package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
5
87 89 92 100 76
*/
public class Array_8 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int inputSize = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int []intArr = new int[inputSize];
		int max = 0;
		int index = 1;
		
		int result[] = new int[intArr.length];
		
		
		// 배열로 풀어주기 위해서
		for(int i = 0; i < inputSize; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		max = maxArr(intArr);
		
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] == max) {
				result[i] = 1;
				continue;
			} else {
				for(int j = 0; j < intArr.length; j++) {
					if(i == j) continue;
					if(intArr[i] <intArr[j]) index++;
				}	
				result[i] = index;
				index = 1;
			}
		}
		
		for(int i : result) {
			sb.append(i + " ");
		}
		System.out.println(sb);
	}
	
	public static int maxArr(int[] arr) {
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= max) max = arr[i];
		}
		return max;
	}
}
