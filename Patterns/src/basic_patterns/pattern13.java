package basic_patterns;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the pattern Size : ");
		int s=sc.nextInt();
		int n=1;
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+n);
				n=1+n;
				}
				System.out.println();
		}
sc.close();
	}

}
