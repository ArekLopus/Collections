package colls;

import java.util.*;

public class Sieve {
	
	static long min = 0;
	static long max = 0;
	
	public static void main(String[] s) {
		for(int i=0; i<200; i++) {
			sieve();
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
	}
	
	public static void sieve() {
		int n = 2000000;
		long start = System.currentTimeMillis();
		BitSet b = new BitSet(n + 1);
		int count = 0;
		int i;
		for (i = 2; i <= n; i++)
			b.set(i);
		i = 2;
		while (i * i <= n) {
			if (b.get(i)) {
				count++;
				int k = 2 * i;
				while (k <= n) {
					b.clear(k);
					k += i;
				}
			}
			i++;
		 }
		 while (i <= n) {
			 if (b.get(i)) count++;
			 i++;
		 }
		 long end = System.currentTimeMillis();
		 System.out.println(count + " primes");
		 end = end - start;
		 System.out.println(end + " milliseconds");
		 if(end > max || max == 0) max = end;
		 if(end < min || min == 0) min = end;
	}
	
	

}
