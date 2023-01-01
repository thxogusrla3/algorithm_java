package section3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> result = new ArrayList<Integer>();
		
		int inputSize1 = Integer.parseInt(br.readLine());
		List<Integer> arr1 = setIntArr(br.readLine().split(" "));
		
		int inputSize2 = Integer.parseInt(br.readLine());
		List<Integer> arr2 = setIntArr(br.readLine().split(" "));
		
		for(int i = 0; i < arr1.size(); i++) {
			if(arr2.indexOf(arr1.get(i)) != -1) {
				result.add(arr1.get(i));
			}
		}
		Collections.sort(result);
		System.out.println(result.toString().replaceAll("[^0-9\s]", ""));
		
	}
	
	public static ArrayList<Integer> setIntArr(String[] pArr) {
		ArrayList<Integer> setArr = new ArrayList<Integer>();
		
		for(int i = 0; i < pArr.length; i++) {
			setArr.add(Integer.parseInt(pArr[i]));
		}
		
		return setArr;
	}
}
