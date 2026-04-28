package basic_Programs;

import java.util.Scanner;

public class PrimeNumber {

	void checkPrime(int n) {
		if (n<0) {
			System.out.println("-1");
		}else if(n==0) {
			System.out.println("-2");
		}else {
			int count=0;
			for(int i=1;i<=n;i++) {
				
				if(n%i==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not prime");
			}
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		PrimeNumber p=new PrimeNumber();
		
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		p.checkPrime(n);
		sc.close();
	}

}
