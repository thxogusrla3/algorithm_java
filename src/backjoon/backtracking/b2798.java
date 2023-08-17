package backjoon.backtracking;

import java.util.Arrays;
import java.util.Scanner;

/**
 * n개 중 r개를 모두 랜덤으로 뽑고 3장의 합 중 m과 가장 가까운 합을 찾는 문제.
 * 단 중복은 안됨.
 *
 * input
 *  5 21
 *  5 6 7 8 9
 *output
 *  21
 * */

public class b2798 {
    static int n;
    static int m;

    static int[]arr ;
    static int[]tempArr;
    static int _result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   //전체 갯수
        m = sc.nextInt();   //3개 뽑아서 합친게 m이랑 제일로 가까운 수
        arr = new int[n];
        tempArr = new int[3];

        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        combination(0, 0);
        System.out.println(_result);
    }

    public static void combination(int depth, int start) {
        if(depth == 3) {
            int tempSum = 0;

            for(int i = 0; i < tempArr.length; i++) {
                tempSum += tempArr[i];
            }

            if(_result <  tempSum  && _result < tempSum ) {
                _result = tempSum;
            }

            return ;
        }
        for(int i = start; i < n; i++) {
            tempArr[depth] = arr[i];
            combination(depth + 1, i + 1);
        }

    }
}
