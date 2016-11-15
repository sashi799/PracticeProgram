package sas.java.practice.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeSort {

	
	private <T extends Comparable<T>> void mergeSort(List<T> data, int low, int high){
		if(low < high){
			int mid = (low+high)/2;
			mergeSort(data, low, mid);
			mergeSort(data, mid+1, high);
			merge(data, low, high);
		}
	}

	private <T extends Comparable<T>> void merge(List<T> data, int low, int high) {
		List<T> temp = new ArrayList<>();
		int mid = (low+high)/2;
		int index2 = low;
		int index3 = mid+1;
		
		while(index2 <= mid && index3 <= high){
			if(data.get(index2).compareTo(data.get(index3)) < 0){
				temp.add(data.get(index2));
				index2++;
			}else{
				temp.add(data.get(index3));
				index3++;
			}
		}
		
		while(index2 <= mid){
			temp.add(data.get(index2));
			index2++;
		}
		while(index3 <= high){
			temp.add(data.get(index3));
			index3++;
		}
		for(int i=low, j=0; i<=high; i++, j++){
			data.set(i, temp.get(j));
		}
		
		
	}
	
	public static void main(String[] args) {
		Integer[] data = {1,3,9,45,22,0,56};
		List<Integer> idata = new ArrayList<>(Arrays.asList(data));
		int low = 0;
		int high = idata.size()-1;
		MergeSort ms = new MergeSort();
		ms.mergeSort(idata, low, high);
		for (int i : idata) {
			System.out.println(i);
		}
		
		List<String> sdata = new ArrayList<>();
		sdata.add("xyz");
		sdata.add("XYZ");
		sdata.add("abc");
		sdata.add("Abc");
		sdata.add("wq");
		high = sdata.size()-1;
		ms.mergeSort(sdata, low, high);
		for (String s : sdata) {
			System.out.println(s);
		}
		
	}
}
