package GeeksForGeeks;

import java.util.Scanner;

public class SubArrayWIthGIvenSum_GFG {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		while(T-->0) {
			int N = scan.nextInt();
			int sum = scan.nextInt();
			
			int arr[] = new int[N];
			//array input 
			for(int i=0;i<N;i++) {
				arr[i] = scan.nextInt();
			}
			
			int temSum=0, header=0, flag=0;
			for(int z=0;z<N;z++) {
				temSum += arr[z];
				while(temSum>sum) {
					temSum = temSum - arr[header];
					header++;
				}
				
				if(temSum == sum) {
					flag = 1;
					System.out.println((header+1) + " " + (z+1));
					break;
				}
			
			}
			
			if(flag==0) System.out.println(-1);
		}
	}
}
