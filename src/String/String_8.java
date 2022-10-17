package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_8 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String []str = reader.readLine().toLowerCase().replaceAll("[^\\sa-zA-Z]", "").split(" ");
		
		for(int i = 0; i < str.length; i++) {
			if(!(sb.append(str[i]).reverse().toString().equals(str[str.length - i - 1]))) {
				System.out.println("NO");
				return ;
			} else {
				sb.setLength(0);
			}
		}
		
//		found7, time: study; Yduts; emit, 7Dnuof
		
		
//		for(String s : str.split(" ")) {
//			if(!str.contains(sb.append(s).reverse())) {
//				System.out.println("NO");
//				return ;
//			} else {
//				sb.setLength(0);
//			}
//		}
		System.out.println("YES");
		
	}
}
