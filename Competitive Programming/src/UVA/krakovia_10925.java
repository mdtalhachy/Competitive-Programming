package UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class krakovia_10925 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		
		int caseno = 1;
		
		while(true) {
			int N = scan.nextInt(), F = scan.nextInt();
			if(N==0 && F==0) break;
			
			BigInteger sum = BigInteger.ZERO;
			for(int i=0;i<N;i++) {
				BigInteger V = scan.nextBigInteger();
				sum = sum.add(V);
			}
			
			System.out.println("Bill #" + caseno + " costs " + sum 
					+ ": each friend should pay " + sum.divide(BigInteger.valueOf(F)));
		}	
		
		
		scan.close();
	}

}
