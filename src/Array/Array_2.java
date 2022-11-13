package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
입력예제 1
8
130 135 148 140 145 150 150 153
출력예제 1
5
*/
public class Array_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int max = 0;
		int temp = 0;		
		int result = 0;
		
		int person = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			temp = Integer.parseInt(st.nextToken());
			if(max < temp) {
				max = temp;
				result++;
			}
		}
		System.out.println(result);
		
	}
}
