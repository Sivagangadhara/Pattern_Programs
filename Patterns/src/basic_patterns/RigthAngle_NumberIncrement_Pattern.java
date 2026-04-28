package basic_patterns;

import java.util.Scanner;

public class RigthAngle_NumberIncrement_Pattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Size of Pattern : ");
		int size=sc.nextInt();
		
		for(int i=1;i<=size;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=size;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
