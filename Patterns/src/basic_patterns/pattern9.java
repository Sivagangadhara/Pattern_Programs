package basic_patterns;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter The Pattern Size : ");
		int s=sc.nextInt();
		for(int i=1;i<=s;i++) {
			
			for(int j=1;j<=s-i;j++)
				System.out.print(" ");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("*");
			System.out.println();
		}
		for(int n=s;n>=1;n--) {
			for(int m=1;m<=s-n;m++)
				System.out.print(" ");
			for(int v=1;v<=2*n-1;v++)
				System.out.print("*");
			System.out.println();
		}
     sc.close();
	}

}
