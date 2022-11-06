package String;

import java.io.*;
import java.util.Arrays;

public class String_10 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String []str = reader.readLine().split(" ");
		int[] result = new int[str[0].length() - 1];
		int count = 0;
		
		for(int i = 0; i < str[0].length() - 1; i++) {    //str[0].charAt(i) 가 기준이되는거
			if(str[0].charAt(i) == str[1].charAt(0)) {
				result[i] = 0;
				continue;
			}
			
			for(int j = 0; j < str[0].length() - 1; j++) {
				if(str[0].charAt(j) == str[1].charAt(0)) {
					if(i >= j) {
						count = count < (i - j) ? count : (i - j);
					} else {
						count = count > (j - i) ? (j - i) : count;
					}
				}
			}
			
			result[i] = count;
		}
		
		System.out.println(Arrays.toString(result));
		
	}
}
