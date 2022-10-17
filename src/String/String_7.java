package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_7 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = reader.readLine().toLowerCase(); 
		
		sb.append(str);
		
		System.out.println(str.equals(sb.reverse().toString()) ? "YES" : "NO");
		
	}
}
