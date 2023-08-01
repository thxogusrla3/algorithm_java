package backjoon.dynamicPrograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1463_1로만들기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int val = n;
        int result;

        while (val != 1) {
            if(val % 3 == 0) {
                val /= 3 ;
            } else if(val % 2 == 0) {
                val /= 2;
            } else {
                val -= 1;
            }
        }
    }
}
