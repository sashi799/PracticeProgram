package sas.java.practice.combination;

public class SumAllPermutationOfNDigit {

	/*
	 * Permutation = n!
	 * 123 = {123, 132, 213, 231, 312, 321 }
	 * 
	 * Every digit will occur n!/n times in each bit location.
	 * 
	 * Here 6/2 = 2 times at each bit, from MSB to LSB
	 * 
	 * so sum at bit location i, S = (sum of digits) * n!/n * 10^i, where i=0 at LSB and i = 0...n -1 
	 * 
	 * */
	
	final Integer TEN = 10;
	
	public Integer sumAllPermutation(Integer number){
		Integer totalSum = 0;
		int arr[] = convertToArray(number);
		Integer digitSum = sumDigits(arr);
		Integer multiplier = fact(arr.length)/arr.length;
		int i =0;
		int power = 0;
		while(i < arr.length){
			power = (int) Math.pow(TEN, (double)i++);
			totalSum += digitSum * multiplier * power;
			
		}
		return totalSum;
	}
	
	private Integer fact(int n){
		if(n == 0 || n == 1)
			return 1;
		return n *fact(n-1);
		
	}
	
	private int[] convertToArray(int number){
		String num = Integer.toString(number);
		int[] arr = new int[num.length()];
		for (int i=0; i < num.length(); i++) {
			arr[i] = num.charAt(i) - '0';
		}
		return arr;
	}
	
	private Integer sumDigits(int[] number) {
		Integer sum = 0;
		for (int i : number) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int number = 123;
		SumAllPermutationOfNDigit test = new SumAllPermutationOfNDigit();
		System.out.println(test.sumAllPermutation(number));
		System.out.println(test.sumAllPermutation(12456));
	}
	
	
	
}
