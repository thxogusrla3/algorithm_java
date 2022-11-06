package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_9 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String inputStr = reader.readLine();
		
		System.out.println(Integer.parseInt(inputStr.replaceAll("[^0-9]", "")));
		
	}
}
