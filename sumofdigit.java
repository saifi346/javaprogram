package mine;
import java.util.*;
public class sumofdigit {

	public static void main(String[] args) {
		int n,sum=0,r;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n<0){
			System.out.println("Invalid Number");
		}
		else{
			while(n>0){
				r=n%10;
				sum=sum+r;
				n=n/10;
			}
		}
		System.out.println("sum of digits is "+sum);
	}

}
