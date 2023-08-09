package backjoon.dynamicPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/2294
*참고:

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

        for(int i = 1;i <= k; i++){
            dp[i] = k + 1;
        }

        for(int i = 1 ; i <= n; i++) {
            p[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 1; i <= n; i++) {
            //주어진 코인으로 j 값을 잡아야, 1, 5, 12 일 때 j가 5부터 시작이라면
            //1에서 처음 dp[5] = 5로 설정되었고
            //dp[5], dp[j(5) - 5] + 1 -> 5는 5 - 5하나로만 만들수있으니까  6은 6 - 5 - 1
            //이게 다 비교가되면 진행됨.
            for(int j = p[i]; j <= k; j++) {  //p[] = 1, 5 ,12
                //점화식
                dp[j] = Math.min(dp[j], dp[j - p[i]] + 1);
            }
        }
        System.out.println(dp[k] == k + 1 ? -1 : dp[k]);
    }
}
