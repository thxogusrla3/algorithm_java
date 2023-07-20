package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
DFS 로 푸는중 0719
https://www.acmicpc.net/problem/2468
5
6 8 2 6 2
3 2 3 4 6
6 7 3 3 2
7 2 5 3 6
8 9 5 2 7
*/
public class b2468_안전영역 {
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int map[][];
    static boolean visited[][];
    static int N;
    static int maxH;
    static int result = 1;
    static int cnt = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for(int i = 0; i < N; i++) {
            String []str = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                int val = Integer.parseInt(str[j]);
                maxH = Math.max(maxH, val);
                map[i][j] = val;
            }
        }

        for(int i = 1 ; i <= maxH; i++) {
            visited = new boolean[N][N];
            cnt = 0;

            for(int j = 0; j < N; j++) {
                for(int k = 0 ; k < N; k++) {
                    if(map[j][k] > i && visited[j][k] != true) {
                        dfs(j, k, i);
                        cnt++;
                    }
                }
            }
            result = Math.max(result, cnt);
        }
        System.out.println(result);
    }

    public static void dfs(int x, int y, int h) {
        visited[x][y] = true;

        for(int i = 0 ; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(checkPoint(nx, ny) && map[nx][ny] > h ) {
                dfs(nx, ny, h);
            }
        }
    }
    public static boolean checkPoint(int x, int y) {
        return  x >= 0 && y >= 0 && x < N && y < N && visited[x][y] == false; //이게 true여야 if조건 통과함.
    }
}
