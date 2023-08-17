package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 https://www.acmicpc.net/problem/10819 차이를최대로(기본)
|A[n] - A[n+1]| + |A[n+1] - A[n+2]| ..
Input
    6
    20 1 15 8 4 10
Out
    62
 */

public class b10819 {
    static int []arr;
    static int []tempArr;
    static int N;

    static int Result;
    static boolean[] visited;

    public static void main(String[] args) {
        arr = new int[] {20, 1, 15, 8, 4, 10};
        N = arr.length;
        tempArr = new int[N];
        visited = new boolean[N];

        permutation(0);

        System.out.println(Result);
    }

    public static void permutation(int depth) {
        if(arr.length == depth) {
            int result = 0;
            for(int i = 0; i < N - 1; i++) {
                result += Math.abs(tempArr[i] - tempArr[i+1]);
            }
            Result = Math.max(Result, result);
            return ;
        }

        for(int i = 0 ; i < N; i++) {
            if(visited[i]) continue;

            visited[i] = true;
            tempArr[depth] = arr[i];
            permutation(depth + 1);
            visited[i] = false;
        }
    }
}
