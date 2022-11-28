package Array;

import java.util.Arrays;
import java.util.Scanner;


public class Array_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int []arr = new int[input];
		String result = "";
		for(int i = 0; i < input; i++) {
			if(i <= 1) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i-2] + arr[i-1];
			}
		}
		
		for(int i : arr) {
			result += (i + " ");
		}
		
		System.out.println(result);
	}
}
