package Array;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Array_10 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputSize = Integer.parseInt(br.readLine());
		int[][]arr = new int[inputSize][inputSize];
		String[] tempArr = new String[inputSize];
		
		int result = 0;
		//입력배열 셋팅
		for(int i = 0; i<inputSize; i++) {
			tempArr = br.readLine().split(" ");
			for(int j = 0; j < tempArr.length; j++) {
				arr[i][j] = Integer.parseInt(tempArr[j]);
			}
		}
		
		for(int i = 0; i < inputSize; i++) {
			for(int j = 0; j < inputSize; j++) {
				if(j != 0) {
					if(arr[i][j] <= arr[i][j - 1]) continue;
				} //왼쪽이 j == 0 일때 왼쪽은 아예 없으니까
				
				if(j != inputSize - 1) {
					if(arr[i][j] <= arr[i][j + 1]) continue;
				} //오른쪽은 inputSize - 1 일 때
				
				if(i != 0) {
					if(arr[i][j] <= arr[i - 1][j]) continue;
				} // 위쪽은 첫번째 행 일 때
				
				if(i != inputSize - 1) {
					if(arr[i][j] <= arr[i + 1][j]) continue;
				}
				
				result++;
			}
		}
		
		System.out.println(result);
	}
}			
/*
입력예제 1
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2

출력예제 1
10*/
