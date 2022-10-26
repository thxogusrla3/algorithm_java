package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_8 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = reader.readLine().toLowerCase().replaceAll("[^a-z]", "");
		String result;
		
		result = str.equals(sb.append(str).reverse().toString()) ? "YES" : "NO";
		
		System.out.println(result);
	}
}
