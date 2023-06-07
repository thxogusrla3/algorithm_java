package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * n개 중 r개 뽑을건데
 * 이거에 대한 모든 경우의 수를 구해야해.
 * */
public class permutation_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]arr = new int[n];

        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        permutation(arr, 0, n, n);
    }

    public static void permutation(int[]arr, int depth, int n, int r) {
        if(depth == r) {
            System.out.println(Arrays.toString(arr));
            return ;
        }

        for(int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    public static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
}
