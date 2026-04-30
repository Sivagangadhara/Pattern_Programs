package basic_patterns;

import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Pattern Size : ");
		int s=sc.nextInt();
		System.out.print("Enter the Pattern starting letter : ");
		char c=sc.next().charAt(0);
		
		for(int i=1;i<=s;i++) {
			for(int j=s;j>=i;j--){
				System.out.print(" ");
			}
			char l=c;
			for(int z=1;z<=i;z++) {
				System.out.print(l);
				l++;
			}
			l-=2;
			for(int z=1;z<i;z++) {
				System.out.print(l);
				l--;
			}
			System.out.println();
		}
		

	}

}
