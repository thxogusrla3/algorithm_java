package practice;

import java.util.Arrays;

public class perVisited {
    static int []tempArr = new int[3];
    static boolean []visited = new boolean[3];

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3};

        permutation(arr, 0, 3, 3);

    }
    public static void permutation(int[] arr, int depth, int n, int r) {
        if(depth == r) {
            System.out.println(Arrays.toString(tempArr));
            return ;

        }
        for(int i = 0; i < n; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                tempArr[depth] = arr[i];
                permutation(arr, depth+1, n, r);
                visited[i] = false;
            }
        }
    }
}
