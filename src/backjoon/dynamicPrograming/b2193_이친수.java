package backjoon.dynamicPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
문제: https://www.acmicpc.net/problem/2193
설명: 입력한 N 자리수의 이친수(N = 2 => 1, 0), (n = 3 => 1,0,0 / 1, 0 ,1)
입력
3
출력
2
* */
public class b2193_이친수 {
    static long[]btDp;
    static long[]tbDp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //int는 4바이트 2^32 - 1
        //long 은 8바이트 2^64 - 1
        btDp = new long[n + 1];
        tbDp = new long[n + 1];

        btDp[0] = 0;
        btDp[1] = 1;

        for(int i = 2; i <= n; i++) {
            if(btDp[i] == 0) {
                btDp[i] = btDp[i - 2] + btDp[i - 1];
            }
        }
        System.out.println(btDp[n]);
        System.out.println(recursive(n));
    }
    public static long recursive(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        if(tbDp[n] > 0) {
            return tbDp[n];
        }
        tbDp[n] = recursive(n - 2) + recursive(n - 1);

        return tbDp[n];
    }
}
