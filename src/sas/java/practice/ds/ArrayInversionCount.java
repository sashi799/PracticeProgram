package sas.java.practice.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInversionCount {
	
	
	private <T extends Comparable<T>> Integer mergeSort(List<T> data, int low, int high){
		int count =0;
		if(low < high){
			int mid = (low+high)/2;
			count += mergeSort(data, low, mid);
			count += mergeSort(data, mid+1, high);
			count += merge(data, low, high);
		}
		return count;
	}

	private <T extends Comparable<T>> Integer merge(List<T> data, int low, int high) {
		List<T> temp = new ArrayList<T>();
		int mid = (low+high)/2;
		int index2 = low;
		int index3 = mid+1;
		int count =0;
		while(index2 <= mid && index3 <= high){
			if(data.get(index2).compareTo(data.get(index3)) < 0){
				temp.add(data.get(index2));
				index2++;
			}else{
				temp.add(data.get(index3));
				System.out.println(low +"-"+mid+"-"+high);
				System.out.println(index2);
				System.out.println(data.get(index2)+" > "+data.get(index3));
				index3++;
				count += mid - index2 +1; 
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
		
		return count;
	}
	
	public static void main(String[] args) {
		Integer[] data = {1, 20, 6, 4};
		List<Integer> idata = new ArrayList<Integer>(Arrays.asList(data));
		int low = 0;
		int high = idata.size()-1;
		ArrayInversionCount ms = new ArrayInversionCount();
		int inversionCount = ms.mergeSort(idata, low, high);
		System.out.println("Inversion count = "+inversionCount);
		for (int i : idata) {
			System.out.println(i);
		}
		
		
	}

}
