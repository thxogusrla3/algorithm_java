package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_11 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputSize = Integer.parseInt(br.readLine());
		int [][] arr = new int[5][inputSize];
		String []tempArr = new String[5];
		int [] cntArr = new int[inputSize];
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
					if(i == j) continue;
					if(select == item[j]) cntArr[i]++;
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
