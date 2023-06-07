package practice;

import java.util.Arrays;
import java.util.Scanner;

public class permutation_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        permutation(arr, 0, n, 4);

//        System.out.println(result);
    }

    public static void permutation(int[] arr, int depth, int n, int r) {
//        System.out.println(Arrays.toString(arr) + " depth= " + depth); //+ " n= " + n + "  r=" + r );
        if(depth == n) {
//            System.out.println(Arrays.toString(arr));

            return ;
        }

        for(int i = depth; i < n; i++) {
            System.out.println(" ( " + depth + ", " + i + " ) " + " arr = " + Arrays.toString(arr) );
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
     }

     public static void swap(int[] arr, int depth, int idx) {
        int temp = arr[depth];
        arr[depth] = arr[idx];
        arr[idx] = temp;
     }
}
