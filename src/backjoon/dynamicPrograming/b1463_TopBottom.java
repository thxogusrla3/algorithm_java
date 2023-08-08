package backjoon.dynamicPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * DP란 복잡한 문제를 간단한 여러개 방법으로 나눠서 개발하는 것.
 * 부분 반복 문제, 최적 부분 구조
 * 점화식
 * 기저상태, dp[0] = dp[1] = 1
 * top-bottom -> 재귀
 * bottom-top -> for
 * */
public class b1463_TopBottom {
    static Integer []dp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];

        dp[0] = dp[1] = 0;

        System.out.println(recur(n));
    }

    public static int recur(int n) {
        if(dp[n] == null) {
            //각 상황에 따라 + 1 을 해주는 거는 연산한 횟수를 더해준것이다.
            if(n % 6 == 0) {    //6으로 나눠질 때는 2 ,3, -1 인 모든 경우의 최소값을 구하고
                dp[n] = Math.min(recur(n - 1), Math.min(recur(n / 2), recur(n /3))) + 1;
            } else if( n % 3 == 0) { //3으로 나눠질 땐 3, -1 의 최소값
                dp[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
            } else if(n % 2 == 0) { //2로 나눠질 땐 2, -1 의 최소값
                dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            } else {
                dp[n] = recur(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
