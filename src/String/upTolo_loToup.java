package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author thkim2
 * 여기서 알아둘 것은
 * 알파벳을 아스키코드값으로 변환했을 때
 * 대문자: 65 ~ 90
 * 소문자: 97 ~ 122
 */
public class upTolo_loToup {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		String str = read.readLine();
				
		char[] tempStr1 = str.toCharArray();
		char[] tempStr2 = str.toLowerCase().toCharArray();
		String result = "";
		
		for(int i = 0; i < tempStr1.length; i++) {
			if(tempStr1[i] != tempStr2[i]) {
				result += (char)(tempStr1[i] + 32);
			} else {
				result += (char)(tempStr1[i] - 32);
			}
		}
		
		System.out.println(result);
		
	}
}
