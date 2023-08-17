package backjoon.dynamicPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11048
3 4
1 2 3 4
0 0 0 5
9 8 7 6

31
* */
public class b11048_이동하기 {
    static int[][]dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        dp = new int[n + 1][m + 1];

        for(int i = 1 ; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <= m ; j++) {
                if(i == 1 && j == 1) {
                    dp[i][j] = Integer.parseInt(st.nextToken());
                } else {
                    dp[i][j] = Math.max(Math.max(dp[i-1][j], dp[i][j-1]), dp[i - 1][j - 1]) + Integer.parseInt(st.nextToken());
                }
            }
        }

        System.out.println(dp[n][m]);

    }
}
