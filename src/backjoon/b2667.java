package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.awt.Point;
/* 2667 단지번호 붙이기
https://www.acmicpc.net/problem/2667
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
*/
public class b2667 {
    static int N;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int cnt = 0;
    static int result = 0;

    static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }


        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                 //단지 안에 아파트 개수
                if(visited[i][j] == false && arr[i][j] == 1) { //새단지가 나올 때마다 그 단지서부터 dfs 호출
                    cnt = 0;
//                    recursive_dfs(i, j);
                    queue.add(new Point(i, j));
                    queueBfs(i, j);
                    tempArr.add(cnt);
                    result++;
                }
            }
        }

        Collections.sort(tempArr);

        System.out.println(result);
        for(int i : tempArr) {
            System.out.println(i);
        }
    }

    public static void recursive_dfs(int x, int y) {
        visited[x][y] = true;
        arr[x][y] = 0;
        cnt++;

        for(int i = 0 ; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < N  && visited[nextX][nextY] == false && arr[nextX][nextY] == 1) {
                visited[nextX][nextY] = true;
                arr[nextX][nextY] = 0;

                recursive_dfs(nextX, nextY);
            }
        }
    }

    public static void queueBfs(int x, int y) {
        visited[x][y] = true;
        cnt++;
        while (!queue.isEmpty()) {
            Point n = queue.poll();

            for(int i = 0 ; i < 4; i++) {
                int nowX = n.x + dx[i];
                int nowY = n.y + dy[i];

                if(nowX >= 0 && nowY >= 0 && nowX < N && nowY < N && !visited[nowX][nowY] && arr[nowX][nowY] == 1) {
                    queue.add(new Point(nowX, nowY));
                    visited[nowX][nowY] = true;
                    cnt++;
                }
            }
        }
    }
}

/*
4
1100
0101
1101
0011
* */