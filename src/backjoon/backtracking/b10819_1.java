package backjoon.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * input
 *  6
 *  20 1 15 8 4 10
 * output
 *  62
 * */
public class b10819_1 {
    static int arr[];
    static int tempArr[];
    static boolean visited[];
    static int n;
    static int result;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        arr = new int[n];
        tempArr = new int[n];
        visited = new boolean[n];

        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        solution(0);
        solution2(0);
        System.out.println(result);
    }
    public static void solution(int idx) {
        if(idx == n) {
            int sum = 0;
            for(int i = 0 ; i < tempArr.length - 1; i++) {
                sum += Math.abs(tempArr[i] - tempArr[i+1]);
            }
            result = Math.max(sum, result);
            return ;
        }

        for(int i = 0; i < n; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            tempArr[idx] = arr[i];
            solution(idx + 1);
            visited[i] = false;
        }
    }

    public static void solution2(int depth) {
        if(depth == n) {
            result = result();
        } else {
            for(int i = 0 ; i < n; i++) {
                if(i == depth) continue;

                swap(depth, i);
                solution2(depth + 1);
                swap(depth, i);
            }
        }

    }

    public static void swap(int depth, int idx) {
        int temp = arr[idx];
        arr[idx] = arr[depth];
        arr[depth] = temp;
    }

    public static int result() {
        int sum = 0 ;
        for(int i = 0 ; i < n - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);
        }
        return Math.max(result, sum);
    }
}
