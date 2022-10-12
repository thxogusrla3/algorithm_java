package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * StringTokenizer 하나의 문자열을 여러개의 토근으로 분리하는 클래스
 * 
 *
 */

public class String_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(reader.readLine());
		int count = 0;
		String result = "";
		String token = "";
		while(str.hasMoreTokens()) {
			token = str.nextToken();
			if(token.length() > count) {
				count = token.length();
				result = token;
			}
		}
		
		System.out.println(result);
 		
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = reader.readLine().split(" ");
//		int count = 0;
//		String result = "";
//
//		for(int i = 0; i < str.length; i++) {
//			if(str[i].length() > count) {
//				count = str[i].length();
//				result = str[i];
//			}
//		}
//		System.out.println(result);
//	}
}
