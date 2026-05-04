package basic_patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of Pattern : ");
		int s=sc.nextInt();
		System.out.println();
		for(int i=1;i<=s;i++){
			
			for(int j=i;j<=s;j++)
				System.out.print("*");
//			System.out.println();
			for(int z=1;z<=i;z++) {
				if(z==1)
				System.out.print("");
				else
					System.out.print("  ");
			}
			for(int a=i;a<=s;a++)
				System.out.print("*");
			
			System.out.println();
			
		}
		for(int c=1;c<=s;c++) {
			for( int b=1;b<=c;b++)
				System.out.print("*");
			for(int d=s;d>=c;d--) {
				if(d==s)
					System.out.print("");
				else
					System.out.print("  ");
			}
			for(int z=1;z<=c;z++)
				System.out.print("*");
			
			System.out.println();
		}
		sc.close();
	}

}
