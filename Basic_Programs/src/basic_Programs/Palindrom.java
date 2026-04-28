package basic_Programs;

import java.util.Scanner;

public class Palindrom {
	void checkPrime(int n) {
		if (n<0) {
			System.out.println("-1");
		}else if(n==0) {
			System.out.println("-2");
		}else {
			int orignalnumber=n,rev=0;
		
			while(n>0) {
				int digits=n%10;
				rev=rev*10+digits;
				n=n/10;
			}
			if(orignalnumber==rev) {
				System.out.println("Palindrom");
			}
			else {
				System.out.println("Not Palindrom");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Palindrom p=new Palindrom();
		p.checkPrime(n);
        sc.close();
	}

}
