package basic_patterns;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size=sc.nextInt();
		
		int count=size;
		for(int i=1;i<=size+1;i++) {
			
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
				System.out.print(" * ");
				}
				else {
				System.out.print(" "+count);
				count=count+1;
			}
			}
			System.out.println();
			
		}
		sc.close();
	}

}
