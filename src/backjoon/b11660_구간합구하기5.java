package backjoon;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
누적합 구하기
https://www.acmicpc.net/problem/11660
4 3
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
2 2 3 4
3 4 3 4
1 1 4 4

27
6
64
* */
public class b11660_구간합구하기5 {
    static int N, M;
    static int valArr[][];
    static int pointArr[][];
    static int result[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        N = Integer.parseInt(inputStr[0]);
        M = Integer.parseInt(inputStr[1]);

        result = new int[M];
        valArr = new int[N + 1][N + 1];

        for(int i = 1 ; i <= N; i++) {
            String[] tempStr = br.readLine().split(" ");
            for(int j = 1 ; j <= N; j++) {
                valArr[i][j] = valArr[i-1][j] + valArr[i][j-1] - valArr[i-1][j-1] + setInteger(tempStr[j - 1]);
            }
        }

        for(int i = 0; i < M; i++) {
            String[] tempStr = br.readLine().split(" ");
            Point p1 = new Point(setInteger(tempStr[0]), setInteger(tempStr[1]));
            Point p2 = new Point(setInteger(tempStr[2]), setInteger(tempStr[3]));

            result[i] = valArr[p2.x][p2.y] - valArr[p1.x-1][p2.y] - valArr[p2.x][p1.y - 1] + valArr[p1.x - 1][p1.y - 1];
        }

        for (int item: result) {
            System.out.println(item);
        }
    }

    public static int setInteger(String str) {
        return Integer.parseInt(str);
    }
}
