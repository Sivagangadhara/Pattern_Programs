package basic_patterns;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Pattern Size : ");
		int s=sc.nextInt();
		for(int i=1;i<=s;i++){
			char c=65;
			for(int j=1;j<=i;j++) {
				System.out.print(" "+c);
				int a=(j+65);
				c=(char) a;
			}
			System.out.println();
			
		}
		sc.close();
	}

}
