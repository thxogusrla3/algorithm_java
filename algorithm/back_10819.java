package algorithm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class back_10819 {
	static int N;
	static int Result;
	static int []arr;
	static int []arr2;
	static boolean []visited;
	static int totalCount = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		arr2 = new int[N];
		visited = new boolean[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		reculsive(0);
		
		System.out.println(Result);
		System.out.println(totalCount);
	}
	static void reculsive(int index) {
		totalCount++;
		if(index == N) {
			int sum = 0;
			for(int i = 0; i < N - 1; i++) {
				sum += Math.abs(arr2[i] - arr2[i+1]);
			}
			Result = Math.max(Result, sum);
		}
		for(int i = 0; i < N; i++) {
			if(visited[i] == true) continue;
			
			visited[i] = true;
			arr2[index] = arr[i];
//			System.out.println("index=" + index + " i= " + i + "  " + Arrays.toString(visited));
//			System.out.println(Arrays.toString(arr2));
			reculsive(index + 1);
			visited[i] = false;
			System.out.println("index=" + index + " i= " + i + "  " + Arrays.toString(visited));
		}
		
	}
}
//6272
//6
//20 1 15 8 4 10
