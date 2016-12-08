package sas.java.practice.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class AllPossiblePalindrome {
	static List<String> pList = new ArrayList<String>();
	static List<Integer[]> pListInt = new ArrayList<Integer[]>();

	static void getAllPermutation(String prefix, String str){
		int n = str.length();
		if (n == 0) {
			System.out.println(prefix);
			pList.add(prefix);
		} else {
			for (int i = 0; i < n; i++)
				getAllPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
		}
	}


	public static void Permute(int[] input, int startindex) {
		int size = input.length;

		if (size == startindex + 1) {
			for (int i = 0; i < size; i++) {
				System.out.print(input[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = startindex; i < size; i++) {
				int temp = input[i];
				input[i] = input[startindex];
				input[startindex] = temp;
				Permute(input, startindex + 1);
				temp = input[startindex];
				input[startindex] = input[i];
				input[i] = temp;
				
			}
		}
	}
	
	static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

	static void permute(java.util.List<Integer> arr, int k){
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            System.out.println(java.util.Arrays.toString(arr.toArray()));
        }
    }
	
	static void permuteNoRecursion(int[] ind){
		for(int tail = ind.length - 1;tail > 0;tail--){
			for (int i : ind) {
				System.out.print(i+" ");
			}
	        System.out.println();
		    if (ind[tail - 1] < ind[tail]){//still increasing

		        //find last element which does not exceed ind[tail-1]
		        int s = ind.length - 1;
		        while(ind[tail-1] >= ind[s])
		            s--;

		        swap(ind, tail-1, s);

		        //reverse order of elements in the tail
		        for(int i = tail, j = ind.length - 1; i < j; i++, j--){
		            swap(ind, i, j);
		        }
		        
		    }
		}
	}


	public static void main(String[] args) {

		String str = "abc";
	//	getAllPermutation("", str);
	//	System.out.println(pList.size());
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] =i+1;
		}
	//	Permute(arr, 0);
		
		permuteNoRecursion(arr);

		/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2, 2);
		//map.remove(1);
		System.out.println(map.size());
		Random rand = new Random();
		System.out.println(rand.nextInt(map.size()));

		ArrayList arr[] = new ArrayList[10];*/
	}


}
