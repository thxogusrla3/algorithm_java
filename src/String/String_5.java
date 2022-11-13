package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		char[] inputStr = reader.readLine().toLowerCase().toCharArray();
		int left = 0;
		int right = inputStr.length - 1;
		
		for(int i = 0; i < inputStr.length - 1 ; i++) {
			if(left < right) {
				if(!Character.isAlphabetic(inputStr[i])) {
					left++;
				}
			}
		}
		
	}
}
