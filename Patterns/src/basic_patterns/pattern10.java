package basic_patterns;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Pattern Size : ");
int s=sc.nextInt();

for(int i=1;i<=s;i++) {
	
	for(int j=1;j<=i;j++) 
		System.out.print("*");
	
	System.out.println();
	
}
for(int n=s;n>=1;n--) {
for(int k=1;k<=n;k++) 
	System.out.print("*");
System.out.println();
}
sc.close();
	}

}
