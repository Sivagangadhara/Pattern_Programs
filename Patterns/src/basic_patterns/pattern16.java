package basic_patterns;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of Pattern : ");
		int s=sc.nextInt();
		 System.out.print("Enter starting character : ");
	        char start = sc.next().charAt(0);
	        char c = start;
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+c);
				
			}
			c=(char) (start+(char)i);
			System.out.println();
		}
sc.close();
	}

}
