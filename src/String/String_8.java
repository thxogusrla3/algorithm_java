package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_8 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = reader.readLine().toLowerCase().replaceAll("[^\\sa-zA-Z]", "");
		
		for(String s : str.split(" ")) {
			if(!str.contains(sb.append(s).reverse())) {
				System.out.println("NO");
				return ;
			} else {
				sb.setLength(0);
			}
		}
		System.out.println("YES");
		
	}
}
