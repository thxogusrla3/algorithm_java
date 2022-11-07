package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 0, 1, 2, 3, 4, 5, 6
 * 
*/
public class String_12 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = Integer.parseInt(reader.readLine());
		String sr = reader.readLine();
		
		String binaryStr = "";
		String result = "";
		
		for(int i = 0; i < inputNum; i++) {
			binaryStr = sr.substring(0, 7).replace("#", "1").replace("*", "0");
			int formatInt = Integer.parseInt(binaryStr, 2);
			result += (char)formatInt;
			sr = sr.substring(7);
		}
		System.out.println(result);
	}
	
}
//#****###**#####**#####**##**



//public static void main(String[] args) throws IOException {
//	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	
//	String sr = reader.readLine();
//	String result = "";
//	int c = 6;
//	int sum = 0;
//	int count = 0;
//	for(int i = 0; i < sr.length(); i++) {
//		if(count != 6) {
//			if(sr.charAt(i) == '#') {
//				sum += Math.pow(2, c - i);
//				count++;
//			} 
//		} else {
//			sum += Math.pow(2, c - i);
//			result += (char)sum;
//			sum = 0;
//			count = 0;
//		}
//		System.out.println(sum);
//	}
//	System.out.println(result);
//}


//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//int inputNum = Integer.parseInt(reader.readLine());
//String sr = reader.readLine();
//
//String binaryStr = "";
//String result = "";
//
//for(int i = 0; i < inputNum; i++) {
//	binaryStr = sr.substring(0, 7).replace("#", "1").replace("*", "0");
//	int formatInt = Integer.parseInt(binaryStr, 2);
//	result += (char)formatInt;
//	sr = sr.substring(7);
//}
//System.out.println(result);