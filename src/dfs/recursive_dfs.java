package dfs;

import java.util.Stack;

public class recursive_dfs {

    static boolean[] visitied = new boolean[9];
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        dfs(1);
    }

    public static void dfs(int searchNode) {
        visitied[searchNode] = true;
        System.out.print(searchNode + " -> ");
        for(int nextNode: graph[searchNode]) {
            if(visitied[nextNode] == false) {
                visitied[nextNode] = true;
                dfs(nextNode);
            }
        }
    }
}
