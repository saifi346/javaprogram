package mine;
import java.util.*;
public class marks {
	public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  int n=20,i,count=0;
  int m[]=new int[n];
  for(i=0;i<n;i++)
  {
	  m[i]=sc.nextInt();
	  if(m[i]>=86 && m[i]<=100)
		   count++;
  }
  System.out.println("total no of students who get 86% or above marks "+count);
 }
}
