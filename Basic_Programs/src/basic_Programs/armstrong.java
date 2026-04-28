package basic_Programs;

import java.util.Scanner;

public class armstrong {

	void checkarmstrong(int n) {
		if (n<0) {
			System.out.println("-1");
		}else if(n==0) {
			System.out.println("-2");
		}else {
			int original=n;
			String s=String.valueOf(n);
			int length=s.length();
			int p,r=0;
			for(int i=1;i<=length;i++) {
			 p=n%10;
			 r+=Math.pow(p, length);
			 n=n/10;
				
			}
			if(original==r) {
				System.out.println("armstrong");
			}
			else {
				System.out.println("Not armstrong");
			}
		}
	}
	public static void main(String[] args) {
		armstrong a=new armstrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		a.checkarmstrong(n);
        sc.close();
	}

}
