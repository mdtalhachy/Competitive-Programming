package UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class simplyEmirp_10235 {
	public static void main(String agrs[]) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			int N = scan.nextInt();
			BigInteger BN = BigInteger.valueOf(N);
			
			String R = new StringBuffer(BN.toString()).reverse().toString();
			
			int RN = Integer.parseInt(R);
			BigInteger BRN = BigInteger.valueOf(RN);
			System.out.printf("%d is ", N);
			
			if(!BN.isProbablePrime(10)) {
				System.out.println("not prime.");
			}else if(N != RN && BRN.isProbablePrime(10)) {
				System.out.println("emirp.");
			}else {
				System.out.println("prime.");
			}
			
		}
		
		scan.close();
		
	}
}
