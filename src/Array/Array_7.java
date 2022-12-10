package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
10
1 0 1 1 1 0 0 1 1 0
*/
public class Array_7 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int []tempArr = new int[num];
		
		int i = 0;
		int cnt = 0;
		int result = 0;
		
		while(st.hasMoreTokens()) {
			tempArr[i++] = Integer.parseInt(st.nextToken());
		}
		
		i = 0;
		
		
		while(i < tempArr.length) {
			if(tempArr[i] == 0) {
				cnt = 0;
			} else {
				cnt ++;
				result += cnt;
			}
			i++;
		}
		
		System.out.println(result);
	}
}
