package basic_patterns;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter The Pattern Size : ");
		int s=sc.nextInt();
		
		for(int i=1;i<=s;i++) {
			
			for(int j=1;j<=i;j++) 
				System.out.print(j);
			for(int k=s-i;k>=1;k--)
				System.out.print("  ");
			for(int m=i;m>=1;m--)
				System.out.print(m);
			System.out.println();
		}

		sc.close();
	}

	}


