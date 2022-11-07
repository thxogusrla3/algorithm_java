package String;

import java.io.*;
import java.util.Arrays;

public class String_10 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String []str = reader.readLine().split(" ");
		int[] leftArr = new int[str[0].length() - 1];
		int[] rightArr = new int[str[0].length() - 1];
		int[] resultArr = new int[str[0].length() - 1];
		int count = 1;
		
		
		/*
		 * teachermode e
		 * 1. 기준이 되는 인덱스를 하나 뽑는다.
		 * 2. 기준에 따라 왼쪽과 오른쪽 을 비교를 하고
		 * 	- 왼쪽인 경우 
		*/
		for(int i = 0; i < leftArr.length; i++) {
			if(str[0].charAt(i) == str[1].charAt(0)) {
				leftArr[i] = 0;
				count = 1;
			} else {
				leftArr[i] = count;
				count++;
			}
		}
		count = 0;
		for(int i = rightArr.length - 1; i >= 0; i--) {
			if(str[0].charAt(i) == str[1].charAt(0)) {
				rightArr[i] = 0;
				count = 1;
			} else {
				rightArr[i] = count;
				count++;
			}
		}
		
		for(int i = 0; i < resultArr.length; i++) {
			resultArr[i] = Math.min(rightArr[i], leftArr[i]);
		}
		
		System.out.println(Arrays.toString(resultArr));
		
	}
}
