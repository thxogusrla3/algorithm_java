package backjoon.dynamicPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
https://www.acmicpc.net/problem/1463
참고: https://smartpro.tistory.com/24
* */
public class b1463_1로만들기 {
    static Integer[] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int val = n;

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;  //dp[1] = 0; -> 1은 이미 1 이니까 연산이 필요없지.

        System.out.print(recur(n));
    }

    //각 상황에 따라 Math.min 에 + 1 은 최소 연산한 횟수에 + 1을 한 것이다.
    //dp[3] => dp[3 / 3] + 1, dp[3 - 1] + 1
    //=> /3으로 연산한거니까 1을 더한거고 -1 도 연산이니까 + 1 을 한거야.
    public static int recur(int n) {
        if(dp[n] == null) {
            if(n % 6 == 0) {
                dp[n] = Math.min(recur(n - 1), Math.min(recur(n / 3), recur(n / 2))) + 1;
            } else if(n % 2 == 0) {
                dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            } else if(n % 3 == 0) {
                dp[n] = Math.min(recur(n / 3), recur(n -1 )) + 1;
            } else {
                dp[n] = recur(n - 1) + 1;
            }
            System.out.println("dp[" + n + "] = " + dp[n]);
        }
        return dp[n];
    }
}
/*
* 점화식을 세워야한다고 했는데..
* 1 * 3 >
* */