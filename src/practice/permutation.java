package practice;

import java.util.Arrays;

/**
 * 순열이란 n개의 값중 r개의 숫자를 모든 순서대로 뽑는경우
 *
 */
public class permutation {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

//        perm(arr, output, visited, 0, n, 3);
        System.out.println();
        permutation(arr, 0, n, 3); //n개 중 r개를 뽑는건데 나는 n개 중 n개 뽑을꺼니깐 그냥 length로 해도됨.

    }
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
           // System.out.println(Arrays.toString(arr));

            return;
        }

        for(int i = depth; i < 3; i++) {
            swap(arr, depth, i);
            //System.out.println(Arrays.toString(arr) + " " + depth + " " + i);
            permutation(arr, depth + 1, 3, 3);
            System.out.println("per(" + (depth+1) + "," + "idx="+ i + " )" );
            System.out.println();
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;

    }
}
