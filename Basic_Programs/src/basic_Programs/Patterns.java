package basic_Programs;

import java.util.Scanner;

public class Patterns {
	
	void numberPattern4(int num) {
		
		if(num<0) {
			System.out.println("-1");
		}else if(num==0) {
			System.out.println("-2");
		}else {
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=i;j++) {
//					if(i==j) {
//					System.out.print(j+" ");
//					}
					System.out.print("* ");
				}
				System.out.println();
			}
		}	
	}

	public static void main(String[] args) {
		Patterns p=new Patterns();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		p.numberPattern4(n);
		sc.close();
	}

}
