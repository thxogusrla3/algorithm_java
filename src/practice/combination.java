package practice;

import java.util.Arrays;

public class combination {
    //조합이란 n개 중 r개를 순서없이 뽑는거야.
    //순열은 ab != ba 인데, 조합은 ab == ba 인거지.
    static int arr[] = new int[]{1,2,3,4, 5};
    static int r = 3;
    static int tempArr[] = new int[r];
    public static void main(String[] args) {

        combinationMethod(0, 0);
    }

    /**
     * depth 는 몇번째로 뽑는지
     * start 는 몇번째 인덱스에서부터 뽑을지
     */

    public static void combinationMethod(int depth, int start) {
        if(depth == r) {
            System.out.println(Arrays.toString(tempArr));
            return ;
        }
        for(int i = start; i < arr.length; i++) {
            tempArr[depth] = arr[i];
            combinationMethod(depth + 1, i + 1);
        }
    }
}
