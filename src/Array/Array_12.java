package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_12 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[]inputArr = br.readLine().split(" ");
		int n = Integer.parseInt(inputArr[0]); //학생 수
		int m = Integer.parseInt(inputArr[1]); // 테스트 한 횟수
		int[][]arr = new int[m][n];
		
		int[] cntArr = new int[n];
		int select = 0;
		String[]tempArr = new String[n];
		
		int result = 0;
		
		for(int i = 0; i < m; i++) {
			tempArr = br.readLine().split(" ");
			for(int j = 0; j < tempArr.length; j++) {
				arr[i][j] = Integer.parseInt(tempArr[j]);
			}
		}

		for(int i = 0; i < n; i++) { //n번 학생일 때 
			cntArr = new int[n];
			for(int j = 0; j < m; j++) { // m번 테스트 
				select = arr[j][i]; //
				for(int k = 0; k < n; k++) { 
					if(i == k) continue;
					if(select < arr[j][k]) cntArr[k]++;
				}
			}
			for(int r = 0 ; r < cntArr.length; r++) {
				if(cntArr[r] == m) result++;
			}
			System.out.println(Arrays.toString(cntArr));
		}
		
		System.out.println(result);
	}
}
