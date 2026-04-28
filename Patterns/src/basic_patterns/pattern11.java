package basic_patterns;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Pattern Size : ");
	int s=sc.nextInt();
	for(int i=1;i<=s;i++) {
		int n=i%2;
	  for(int j=1;j<=i;j++) {
		System.out.print(n+" ");
		n=1-n;
	  }
	  System.out.println();
	}
	sc.close();
  }
}
