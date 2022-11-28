package Array;

import java.io.*;
import java.util.StringTokenizer;

/* 
5
2 3 3 1 3
1 1 2 2 3
*/
public class Array_3 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());
		StringTokenizer stA = new StringTokenizer(reader.readLine());
		StringTokenizer stB = new StringTokenizer(reader.readLine());

		int tempA = 0;
		int tempB = 0;
		
		while(stA.hasMoreTokens()) {
			tempA = Integer.parseInt(stA.nextToken());
			tempB = Integer.parseInt(stB.nextToken());
			
			if(tempA == tempB) { //비겼을 때
				System.out.println("D");
			} else if(tempA - tempB == -2 || tempA - tempB == 1) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}
}
