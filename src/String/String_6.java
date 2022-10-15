package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_6 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine().toLowerCase();
		String result = "";
		
		
		for(char s : str.toCharArray()) {
			if(!result.contains(String.valueOf(s))) {
				result += String.valueOf(s);
			}
		}
		
		System.out.println(result);
		 	
	}
}
