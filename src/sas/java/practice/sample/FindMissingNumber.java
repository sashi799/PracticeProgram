package sas.java.practice.sample;

public class FindMissingNumber {
	
	
	public static int findMissingNumber(int[] arr, int size){
		
		int r1 = arr[0];
		int r2 = 1;
		
		for (int i = 1; i < arr.length; i++) {
			r1 = r1 ^ arr[i];
		}
		
		for (int i = 2; i <= size+1; i++) {
			r2 = r2 ^ i;
		}
		
		return r1 ^ r2;
		
	}
	
	static void findTwoMissingNumbers(int[] a, int B){
	    int x=0;
	    for(int i=0; i<a.length;i++){
	        x=x^a[i];
	    }
	    for(int i=1;i<=B;i++){
	        x=x^i;
	    }
	    x = x &(~(x-1));
	    int p=0, q=0;
	    for(int i=0;i<a.length;i++){
	        if((a[i] & x) == x){
	            p=p^a[i];
	        }
	        else{
	            q=q^a[i];
	        }   
	    }
	    for(int i=1;i<=B;i++){
	        if((i & x) == x){
	            p=p^i;
	        }
	        else{
	            q=q^i;
	        }
	    }

	    System.out.println("p: "+p+" : "+q);
	}


	
	public static void main(String[] args) {
		int[] arr = {1,2,4};
		
		findTwoMissingNumbers(arr, 5);
		int a = -8;
		System.out.println(a >> 2);
		System.out.println(8 >>> 2);
		System.out.println(a << 2);
		
		
		
	}
}
