package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_11 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] inputCharArr = reader.readLine().toUpperCase().toCharArray();
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		for(int i = 0; i < inputCharArr.length; i++) {
			if(i + 1 >= inputCharArr.length) {
				sb.append(inputCharArr[i] + "" + (count == 1 ? "" : count));
				break;
			} else {
				if(inputCharArr[i] == inputCharArr[i + 1]) {
					count++;
					continue;
				} else {
					sb.append(inputCharArr[i] + "" + (count == 1 ? "" : count));
					if(i + 1 != inputCharArr.length) {
						count = 1;	
					}
				}		
			}
		}
		System.out.println(sb.toString());
		
	}
}
