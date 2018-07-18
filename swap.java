package mine;
import java.util.*;
public class swap {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("number after swapping "+a+" "+b);
        sc.close();
	}

}
