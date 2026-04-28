package basic_patterns;

import java.util.Scanner;

public class pattren8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size Of Pattren : ");
		int s=sc.nextInt();
		for(int i=s;i>=1;i--) {
			for(int j=1;j<=s-i;j++)
				System.out.print(" ");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("*");
			System.out.println();
			
		}
		
sc.close();
	}

}
