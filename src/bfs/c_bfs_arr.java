package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class c_bfs_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정점 수
        int m = sc.nextInt(); //간선 수 // 데이터 생성시 m만 큼 생성돼야함.
        int v = sc.nextInt(); //시작할 노드

        int[][] adjArr = new int[n+1][n+1];
        boolean[] visited = new boolean[n + 1];

        for(int i = 0 ; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjArr[v1][v2] = 1;
            adjArr[v2][v1] = 1;

            bfs_arr(v, adjArr, visited);
        }
    }
    public static void bfs_arr(int v, int[][]adjArr, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();

        int n = adjArr.length - 1;

        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()) {
            v = q.poll();
            System.out.println(v + " ");

            for(int i = 1; i <= n; i++) {
                if(adjArr[v][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
