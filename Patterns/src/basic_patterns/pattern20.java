package basic_patterns;

import java.util.Scanner;

public class pattern20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Pattern Size : ");
		int s=sc.nextInt();
		
		for(int i=1;i<=s;i++) {
			
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int z=s;z>=i;z--)
				if(z==s) {
					
				}else
				System.out.print("  ");
			for(int c=1;c<=i;c++)
				System.out.print("*");
			System.out.println();
		}
		for(int a=1;a<=s;a++) {
			for(int b=s-1;b>=a;b--)
				System.out.print("*");
			for(int d=1;d<=a;d++)
				System.out.print("  ");
			for(int f=s-1;f>=a;f--)
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();
	}

}
