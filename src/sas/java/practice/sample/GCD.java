package sas.java.practice.sample;

import java.util.HashMap;
import java.util.Map;

public class GCD {

	
	static int gcd(int a, int b) 
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
	
	public static void main(String[] args) {
		System.out.println(gcd(12,3));
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		System.out.println(map.get(1));
		System.out.println(map.remove(2));
		System.out.println(map.remove(null));
		map.put(null, null);
		
	}
	
}
