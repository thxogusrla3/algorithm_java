package backjoon.dynamicPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/2294
*입력
3 15
1
5
12
*출력
3
* */
public class b2294_동전2 {
    static Integer []dp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p[] = new int[n + 1];
        dp = new Integer[k + 1];

        dp[0] = 0; //기저상태, 가장 낮은 문제의 상태

        //d[k] == k 이면 return -1
        for(int i = 1;i <= k; i++){
            dp[i] = k + 1;
        }

        for(int i = 1 ; i <= n; i++) {
            p[i] = Integer.parseInt(br.readLine());
        }

        //p[1] = 1  -> dp[p[1]] ~ dp[15]
        //p[2] = 5  -> dp[p[2]] ~ dp[15]
        //p[3] = 12 -> dp[p[3]] ~ dp[15]
        for(int i = 1; i <= n; i++) {
            for(int j = p[i]; j <= k; j++) {
                dp[j] = Math.min(dp[j], dp[(j - p[i])] + 1);
            }

        }
        System.out.println(dp[k] == k + 1 ? -1 : dp[k]);
    }
}
