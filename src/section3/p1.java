package section3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputSize1 = Integer.parseInt(br.readLine());
		List<Integer> arr1 = setIntArr(br.readLine().split(" "));
		
		int inputSize2 = Integer.parseInt(br.readLine());
		List<Integer> arr2 = setIntArr(br.readLine().split(" "));
		
		arr1.addAll(arr2);
		
		Collections.sort(arr1);
		
		System.out.println(arr1.toString().replaceAll("[^0-9\s]", ""));	//숫자와 띄어쓰기가 아닌 것들은 "" 로 치환
		
	}
	
	public static ArrayList<Integer> setIntArr(String[] pArr) {
		ArrayList<Integer>result = new ArrayList<Integer>();
		
		for(int i = 0; i < pArr.length; i++) {
			result.add(Integer.parseInt(pArr[i]));
		}
		
		return result;
	}
}
