package sample;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter two integers");
     int x=sc.nextInt();
     int y=sc.nextInt();
     if(x==y) {
    	 System.out.println("equals");
     }
     else {
    	 int big=(x>y)?x:y;
    	 int small=(x<y)?x:y;
    	 System.out.println("biggest num:"+big);
    	 System.out.println("smallest num:"+small);
     }

	}

}
