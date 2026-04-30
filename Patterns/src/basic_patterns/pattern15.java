package basic_patterns;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Pattern Size : ");
		int s=sc.nextInt();
		System.out.print("Enter the Starting letter : ");
		char l=sc.next().charAt(0);
		for(int i=s;i>=1;i--) {
			char c=l;
			for(int j=1;j<=i;j++) {
				System.out.print(" "+c);
				c=(char) ((char) j+l);
			}
			System.out.println();
		}
			sc.close();

	}

}
