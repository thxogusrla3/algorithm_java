package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
*/
public class Array_9 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputSize = Integer.parseInt(br.readLine());
		int [][]arr = new int[inputSize][inputSize];
		String []tempArr = new String[inputSize];
		
		int rowSum = 0;
		int rowMaxSum = 0;
		
		int colSum = 0;
		int colMaxSum = 0;
		
		int xLeftSum = 0;
		int xRightSum = 0;
		int xMaxSum = 0;
		
		int result = 0;
		
		//입력배열 셋팅
		for(int i = 0; i<inputSize; i++) {
			tempArr = br.readLine().split(" ");
			for(int j = 0; j < tempArr.length; j++) {
				arr[i][j] = Integer.parseInt(tempArr[j]);
			}
		}
		
		//col, row sum 셋팅
		for(int i = 0; i < inputSize; i++) {
			for(int j = 0; j < inputSize; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
			
			rowMaxSum = rowMaxSum > rowSum ? rowMaxSum : rowSum;
			colMaxSum = colMaxSum > colSum ? colMaxSum : colSum;
			
			rowSum = 0;
			colSum = 0;
		}
		
		for(int i = 0; i < inputSize; i++) {
			xLeftSum += arr[i][i];
			xRightSum += arr[i][inputSize - i - 1];
		}
		
		xMaxSum = Math.max(xLeftSum, xRightSum);
		result = Math.max(rowMaxSum, colMaxSum);
		
		result = Math.max(xMaxSum, result);
		
		System.out.println(result);
	}
}
