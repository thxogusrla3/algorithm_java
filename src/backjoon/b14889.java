package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 6
 0 1 2 3 4 5
 4 0 5 6 5 7
 7 1 0 2 6 8
 3 4 5 0 7 3
 5 6 7 8 9 4
 1 2 3 4 5 6

 4
 0 1 2 3
 4 0 5 6
 7 1 0 2
 3 4 5 0
 */
public class b14889 {
    static int n;
    static int[][]arr;
    static ArrayList<Integer> startArr;
    static ArrayList<Integer> linkArr;
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        String []tempArr = new String[n];

        startArr = new ArrayList<Integer>();
        linkArr = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) {
            tempArr = br.readLine().split(" ");
            for(int j = 0; j < tempArr.length; j++) {
                arr[i][j] = Integer.parseInt(tempArr[j]);
            }
        }
        combinationArrayList(0, 1);
        System.out.println(result);

    }

    public static void combinationArrayList(int depth, int start) {
        if(depth == n / 2) {
            linkArr.clear();
            for(int i = 1 ; i <= n; i++) {
                if(!startArr.contains(i)) {
                    linkArr.add(i);
                }
            }
            diff();
            System.out.println(startArr + "  " + linkArr);
            return ;
        } else {
            for(int i = start; i <= n; i++) {
                startArr.add(i);
                combinationArrayList(depth + 1, i + 1);
                startArr.remove(startArr.size() - 1);
            }
        }
    }

    public static void diff() {
        int startSum = 0;
        int linkSum = 0;

        for(int i = 0; i < startArr.size(); i++) {
            for(int j = i + 1; j < startArr.size(); j++) {

                startSum += arr[startArr.get(i) - 1][startArr.get(j) - 1];
                startSum += arr[startArr.get(j) - 1][startArr.get(i) - 1];

                linkSum += arr[linkArr.get(i) - 1][linkArr.get(j) - 1];
                linkSum += arr[linkArr.get(j) - 1][linkArr.get(i) - 1];
            }
        }
        int val = Math.abs(startSum - linkSum);
        System.out.println("result = " + result + "  " + "val = " + val);
        result = Math.min(val, result);
    }
}
