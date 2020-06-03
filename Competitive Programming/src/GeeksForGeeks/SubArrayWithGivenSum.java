package GeeksForGeeks;

import java.util.Scanner;

public class SubArrayWithGivenSum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		while(T!=0) {
			long N = scan.nextLong();
			long sum = scan.nextLong();
			
			long[] elements = new long[1000000];
			
			for(int i=0;i<N;i++) {
				elements[i] = scan.nextLong();
			}
			
			//sub array search
			int j,k,z;
			int flag = 1;
			long quickSum;
			for(k=0;k<N;k++) {
				for(j=k;j<N;j++) {
					quickSum = 0;
					for(z=k;z<=j;z++) {
						quickSum += elements[z];
					}
					
					//chekcing if subSum is equal to given sum
					if(quickSum == sum) {
						System.out.println(k+1 + " " + z);
						flag = 0;
						break;
					}
					
					if(flag == 0) break;
					
				}
			}
			
			if(flag==1) {
				System.out.println(-1);
			}
			
			T--;
		}
	}
}
