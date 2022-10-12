package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findString {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		
		char findChar = reader.readLine().toLowerCase().charAt(0); 
		
		char []tempArr = str.toLowerCase().toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < tempArr.length; i++) {
			if(tempArr[i] == findChar) {
				count++;
			}
		}
		System.out.println(count);
	}
}
