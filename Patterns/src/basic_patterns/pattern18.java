package basic_patterns;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Pattern Size : ");
		int s=sc.nextInt();
		
		System.out.print("Enter Pattren Starting Letter");
           char l=sc.next().charAt(0);
           
           for(int i=1;i<=s;i++) {
        	   char c = (char)(l - (i - 1));
;
        	   for(int j=1;j<=i;j++) {
        		   System.out.print(c+" ");
        		   c++;
        	   }
        	   System.out.println();
           }
           sc.close();
	}

}
