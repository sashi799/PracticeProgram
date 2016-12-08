package sas.java.practice.sample;

public class FindMaxSumNotAdjacent {

	
	
	
	int FindMaxSum(int arr[], int n)
    {
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;
 
        for (i = 1; i < n; i++)
        {
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl;
 
            /* current max including i */
            incl = excl + arr[i];
            excl = excl_new;
        }
 
        /* return max of incl and excl */
        return ((incl > excl) ? incl : excl);
    }
	
	
	public static void main(String[] args)
    {
		FindMaxSumNotAdjacent sum = new FindMaxSumNotAdjacent();
        int arr[] = new int[]{1, -2, 3, 5};
        System.out.println(sum.FindMaxSum(arr, arr.length));
    }
	
	
}
