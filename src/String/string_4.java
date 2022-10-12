package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string_4 {
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(reader.readLine());
		String []strArr = new String[N];
		String result = "";
		
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = reader.readLine();
		}
		
		for(String str: strArr) {
			for(int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			System.out.println(result);
			result = "";
		}
	}
}
