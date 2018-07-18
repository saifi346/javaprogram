package mine;
import java.util.*;
public class smallestNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int small=a<b?(a<c?a:c):b<c?b:c;
		System.out.println("smallest number is "+small);
        sc.close();
	}

}
