package sas.java.practice.string;

import java.util.Arrays;

public class Combination {

	static StringBuilder sb = new StringBuilder();
	static String inputstring = "abc";


	// The main function that prints all combinations of size r
	// in arr[] of size n. This function mainly uses combinationUtil()
	static void printCombination(char arr[], int n, int r)
	{
		// A temporary array to store all combination one by one
		char data[]=new char[r];
		Arrays.sort(arr);
		// Print all combination using temprary array 'data[]'
		combinationUtil(arr, n, r, 0, data, 0);
	}

	static void combinationUtil(char arr[], int n, int r, int index,
			char data[], int i)
	{
		// Current combination is ready to be printed, print it
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}
		// When no more elements are there to put in data[]
		if (i >= n)
			return;

		data[index] = arr[i];
		// current is included, put next at next location
		combinationUtil(arr, n, r, index+1, data, i+1);
		//remove dups
		if(i < n-2){
			while (arr[i] == arr[i+1]){
				i++;
				if(i > n-2)
					break;
			}
		}

		// current is excluded, replace it with next (Note that
		// i+1 is passed, but index is not changed)
		combinationUtil(arr, n, r, index, data, i+1);
	}

	static void printCombination(int arr[], int n, int r)
	{
		// A temporary array to store all combination one by one
		int data[]=new int[r];
		Arrays.sort(arr);
		// Print all combination using temprary array 'data[]'
		combinationUtil(arr, n, r, 0, data, 0);
	}

	static void combinationUtil(int arr[], int n, int r, int index,
			int data[], int i)
	{
		// Current combination is ready to be printed, print it
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}
		// When no more elements are there to put in data[]
		if (i >= n)
			return;

		data[index] = arr[i];
		// current is included, put next at next location
		combinationUtil(arr, n, r, index+1, data, i+1);
		//remove dups
		if(i < n-2){
			while (arr[i] == arr[i+1]){
				i++;
				if(i > n-2)
					break;
			}
		}

		// current is excluded, replace it with next (Note that
		// i+1 is passed, but index is not changed)
		combinationUtil(arr, n, r, index, data, i+1);
	}
	
	static void combinationUtilInt(int arr[], int data[], int start,
			int end, int index, int r)
	{
		// Current combination is ready to be printed, print it
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}

		// replace index with all possible elements. The condition
		// "end-i+1 >= r-index" makes sure that including one element
		// at index will make a combination with remaining elements
		// at remaining positions
		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			combinationUtilInt(arr, data, i+1, end, index+1, r);
		}
	}

	// The main function that prints all combinations of size r
	// in arr[] of size n. This function mainly uses combinationUtil()
	static void printCombinationInt(int arr[], int n, int r)
	{
		// A temporary array to store all combination one by one
		int data[]=new int[r];

		// Print all combination using temprary array 'data[]'
		combinationUtilInt(arr, data, 0, n-1, 0, r);
	}

	static void combine(int start){

		for( int i = start; i < inputstring.length(); i++ ){
			sb.append( inputstring.charAt(i) );
			System.out.println( sb.toString() );
			if ( i < inputstring.length() ){
				combine( i + 1);
			}
			sb.setLength( sb.length() - 1 );
		}
	}



	/*Driver function to check for above function*/
	public static void main (String[] args) {
		char arr[] = "abca".toCharArray(); 
		int r = 2;
		int n = arr.length;
		printCombination(arr, n, r);
		//combine(0);
		int[] arr1 = new int[4];
		for (int i = 0; i < 4; i++) {
			arr1[i] =i+1;
		}
		arr1[3]= 1;
		n = arr1.length;
		printCombination(arr1, n, r);
	}
}
