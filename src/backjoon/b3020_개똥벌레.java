package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/3020
https://lotuslee.tistory.com/108
6 7
1
5
3
3
5
1

2 3
* */
public class b3020_개똥벌레 {
    static int N, H;
    static int[] arr;
    static int result = Integer.MAX_VALUE;
    static int dupleVal = 1;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //석순 및 종류석 갯수
        H = Integer.parseInt(st.nextToken()); //높이

        int[]bot = new int[H + 2];
        int[]top = new int[H + 2];

        for(int i = 0; i < N / 2; i++) { //왜  N / 2 -> 무조건 짝수이며, 석순 종류석 이니까 N/2 가 되는거야.
            bot[Integer.parseInt(br.readLine())]++;
            top[H - Integer.parseInt(br.readLine()) + 1]++;
        }

        System.out.println(Arrays.toString(bot));

        for(int i = 1; i <= H; i++) {
            bot[i] += bot[i - 1];
        }
        System.out.println(Arrays.toString(bot));

        for(int i = H; i > 0; i--) {
            top[i] += top[i + 1];
        }

        int min = N; //N은 석순과 종류석 갯수니까
        int cnt = 0;

        for(int i = 1; i <= H; i++) {
            int obs = (bot[H] - bot[i - 1]) + (top[1] - top[i + 1]);

            if(obs < min) {
                min = obs;
                cnt = 1;
            } else if(obs == min) {
                cnt++;
            }
        }

        System.out.println();

        System.out.println(min + " " + cnt);
    }
}
