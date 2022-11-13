package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/* 
 	입력예제 1
		6
		7 3 9 5 6 12
	출력예제 1
		7 9 6 12
 */
public class Array_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int firstInput = Integer.parseInt(reader.readLine());
		
		st = new StringTokenizer(reader.readLine());
		int[]arr = new int[firstInput];
		String result = "";
		
		for(int i = 0; i < firstInput; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(result.equals("")) {
				result += arr[i] + " ";
			} else {
				if(arr[i - 1] < arr[i]) {
					result += arr[i] + " ";
				}
			}
		}
		
		System.out.println(result);
	}
}
