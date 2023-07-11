package dfs;

import java.util.Stack;

public class stack_dfs_1 {

    static boolean[] vistied = new boolean[9];
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        //처음 탐색할 노드를 넣어줘야지.
        stack.push(1);
        vistied[1] = true;

        //탐색할 노드를 stack.pop 및 pop한 노드의 인접 노드를 넣어줌.
        while(!stack.isEmpty()) {
            int searchNode = stack.pop();

            System.out.print(searchNode + " -> ");

            for(int nextNode : graph[searchNode]) {
                if(vistied[nextNode] == false) {
                    stack.push(nextNode);
                    vistied[nextNode] = true;
                }
            }
        }
    }
}
