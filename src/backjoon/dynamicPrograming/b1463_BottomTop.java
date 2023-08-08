package backjoon.dynamicPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Bottom top 방식은 for 문 써서 풀자
public class b1463_BottomTop {
    static Integer[] dp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];

        //기저상태(가장 낮은 문제의 상태)
        dp[0] = dp[1] = 0;

        for(int i = 2; i <= n; i++) {
            //else if로 i % 2, i %3 을 해줬다면 i % 6 까지 해줘야하겠지만, if로 두개다 되어 있으니 패스
            //시작부터 목표까지 올라가는거니까 기저상태 값이 있으니까 이걸 써주면 됨.
            //dp[3]은 3으로 나뉘니까 3으로 나누는 경우와 그냥 1을 빼는 경우가 있음. 결국 dp[3/3 , 3 - 1] 니까 최소값으로 넣어줘
            dp[i] = dp[i - 1] + 1;
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}
