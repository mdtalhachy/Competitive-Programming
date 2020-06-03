package HalimBrothersPracticeProblems;

import java.math.BigInteger;

public class Excercise5_3_1_1 {
	
	public static void main(String args[]) {
		int start = 1,i;
		BigInteger facto = BigInteger.valueOf(start);
		for(i=2;i<=25;i++) {
			BigInteger increment = BigInteger.valueOf(i);
			facto = facto.multiply(increment);
		}
		
		String lastDigit = facto.toString();
		
		for(int k=(lastDigit.length())-1;k>=0;k--) {
			char dig = lastDigit.charAt(k);
			int checkDig = (int) dig;
			
			if(checkDig=='0') {
				
			}else {
				System.out.println("The last non zero digit is: " + dig);
				break;
			}
			
		}
		
		
		//System.out.println(lastDigit);
	}
}
