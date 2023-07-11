package bfs;

import java.util.*;
import java.util.stream.Collectors;

public class link_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //노드 수, 간선 수, 시작 노드;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt(); //검색 시작할 노드.

        //간선 수 만큼 노드와 노드 연결 필요.
        LinkedList<Integer> adjList[] = new LinkedList[n + 1]; //0값은 넣지 않을꺼기 때문에

        //노드 수 만큼 방문여부 체크가 필요
        boolean[] visited = new boolean[n+1];

        for(int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        //연결된 노드들은 양방향임.
        for(int i = 0; i <m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        for(int i = 1; i < m + 1; i++) {
            Collections.sort(adjList[i]); //순서를 위해 정렬
        }

        bfs_list(v, adjList, visited);

    }

    public static void bfs_list(int targetNode, LinkedList[] adjList, boolean[] visited ) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(targetNode);
        visited[targetNode] = true;

        while(q.size() > 0) {
            targetNode = q.poll();
            System.out.print(targetNode + " ");


            Iterator<Integer> iter = adjList[targetNode].listIterator();

            while (iter.hasNext()) {
                int w = iter.next();
                if(!visited[w]) {
                    q.add(w);
                    visited[w] = true;
                }
            }
        }
    }
}