package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
5
9 8 7 6 5
5 6 7 8 9
1 2 3 7 8
4 5 3 4 2
6 2 8 4 2
*/

public class Array_11 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputSize = Integer.parseInt(br.readLine());
		int [][] arr = new int[5][inputSize];
		String []tempArr = new String[5];
		int [] cntArr = new int[inputSize];
		
		boolean[][] checkArr = new boolean[5][inputSize];
		
		int maxValue = 0;
		int maxIdx = 0;
		
		for(int i = 0; i < inputSize; i++) {
			tempArr = br.readLine().split(" ");
			for(int j = 0; j < 5; j++) {
				arr[j][i] = Integer.parseInt(tempArr[j]);
			}
		}
		
		for(int[] item : arr) {
			for(int i = 0; i < item.length; i++) {
				int select = item[i];
				for(int j = 0; j < item.length; j++) {
					if(i == j || checkArr[i][j] ) continue;
					
					if(select == item[j]) {
						checkArr[i][j] = true;
						cntArr[i]++;
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < cntArr.length; i++) {
			if(maxValue < cntArr[i]) {
				maxValue = cntArr[i];
				maxIdx = i;
			}
		}
		
		System.out.println(maxIdx + 1);
		
	}
}
