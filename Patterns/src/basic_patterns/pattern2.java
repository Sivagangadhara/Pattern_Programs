package basic_patterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print(" Enter The Size : ");
		int s=sc.nextInt();
		
		for(int i=1;i<=s;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
			
			
		}
		
		sc.close();
		
	}

}
