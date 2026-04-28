package basic_patterns;

import java.util.Scanner;

public class RightAngle_Pattern {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Length : ");
		int length=sc.nextInt();
		
		for(int i=1;i<=length;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
