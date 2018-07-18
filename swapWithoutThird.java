package mine;

import java.util.Scanner;

public class swapWithoutThird {
 public static void main(String[] args){	
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println("number after swapping "+a+" "+b);
    sc.close();
}
 }
