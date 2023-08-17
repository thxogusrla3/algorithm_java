package backjoon;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/2178 미로 탐색
4 6
101111
101010
101011
111011

15
* */
public class b2178_MiroSearch {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static Queue<Point> q = new LinkedList<Point>();
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //Input 설정
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0 ; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

//        q.add(new Point(0, 0));
        visited[0][0] = true;

//        bfs(0, 0);
        dfs(0, 0);
        System.out.println(map[N-1][M-1]);

        for(int i = 0 ; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

        System.out.println(result);
    }

    //visited = [동, 서, 남, 북]
    public static void bfs(int x, int y) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        //그냥 왔던 곳 true 처리하면 끝나지.
        while(!q.isEmpty()) {
            Point tp = q.poll();
            for(int i = 0; i < 4; i++) {
                int nowX = tp.x + dx[i];
                int nowY = tp.y + dy[i];

                if(checkPoint(nowX, nowY) && visited[nowX][nowY] == false && map[nowX][nowY] != 0) {
                    q.add(new Point(nowX, nowY));
                    visited[nowX][nowY] = true;

                    map[nowX][nowY] = Math.min(map[tp.x][tp.y] + 1, map[nowX][nowY]); //다음에가 모든 조건을 만족할 때 전 값에 1을 더해 값을 셋팅한다.
                    //그래야 다음에 돌아와서 다른 인접했던걸 탐색할 때 기존꺼를 알 수 있으니까
                }
            }
        }
    }

    //
    public static void dfs(int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        visited[x][y] = true;

        for(int i = 0 ; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(checkPoint(nx, ny) && visited[nx][ny] == false && map[nx][ny] != 0) {
                if(nx == N-1 && ny == M-1) {
                    result = Math.min(result, map[x][y] + 1);
                }
                map[nx][ny] = map[x][y] + 1;
                visited[nx][ny] = true;
                dfs(nx, ny);
                visited[nx][ny] = false;
                map[nx][ny] = 1;
            }
        }
    }

    public static boolean checkPoint(int x, int y) {
        return  x >= 0 && y >= 0 && x < N && y < M; //이게 true여야 if조건 통과함.
    }
}
