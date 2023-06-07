package practice;

import java.util.ArrayList;

public class permutation_arraylist {
    static int[] arr; // 뽑을 기준 배열
    static int n; // 기준 배열 길이
    static int num; // 뽑을 갯수
    public static void main(String[] args) {
        arr = new int[] {1,2,3};
        n = arr.length;
        num = arr.length;

        perArray(new ArrayList<Integer>(), num);

    }

    public static void perArray(ArrayList<Integer> list, int count) {
        if(count == 0) {
            System.out.println(list.toString());
            return ;
        }

        //i만큼?
        for(int i = 0; i < arr.length; i++) {
            if(list.contains(arr[i])) continue;
            list.add(arr[i]);
            perArray(list, count - 1);
            list.remove(list.size() - 1);
        }
    }
}
