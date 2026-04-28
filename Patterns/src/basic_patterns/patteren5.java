package basic_patterns;

import java.util.Scanner;

public class patteren5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter size : ");
		int s=sc.nextInt();
		
		for(int i=1;i<=s;i++) {
			for(int j=s;j>=i;j--)
				System.out.print(" * ");
	System.out.println();
	sc.close();
		}

	}

}
