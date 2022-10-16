package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_5 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String inputStr = reader.readLine();
		char[] temp = new char[inputStr.length()];
		
		for(int i = inputStr.length() - 1; i >= 0; i--) {
			if((inputStr.charAt(i) >= 65 && inputStr.charAt(i) <= 90) || (inputStr.charAt(i) >= 97 && inputStr.charAt(i) <= 122)) {
				temp[inputStr.length() - 1 - i] = inputStr.charAt(i);
			} else {
				temp[i] = inputStr.charAt(i);
			}
		}
		
		System.out.println(temp);
		
	}
}
