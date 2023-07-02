package bfs;

import java.util.*;

public class c_bfs_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정점의 개수
        int m = sc.nextInt(); //간선의 개수
        int v = sc.nextInt(); //탐색 시작 정점 번호

        boolean visited[] = new boolean[n + 1]; //방문 여부 검사.

        LinkedList<Integer>[] adjList = new LinkedList[n+1];

        for(int i = 0; i <=n; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        for(int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        for(int i = 1; i <= n; i++) {
            Collections.sort(adjList[i]);
        }

        bfs_list(v, adjList, visited);

    }

    public static void bfs_list(int v, LinkedList<Integer>adjList[], boolean visited[]) {
        Queue<Integer> queue = new LinkedList<Integer>(); //탐색할 노드 모아두는 곳
        visited[v] = true;
        queue.add(v);

        while (queue.size() != 0) {
            v = queue.poll(); //fifo 꺼냄.
            System.out.print(v + " ");

            Iterator<Integer> iter = adjList[v].listIterator();
            while (iter.hasNext()) {
                int w = iter.next();
                if(!visited[w]) {
                    visited[w] = true;
                    queue.add(w);
                }
            }
        }
    }

}
