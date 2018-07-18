package mine;
import java.util.*;
public class sort {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int i=0,j=0,n,temp;
	 n=sc.nextInt();
	 int arr[]=new int[n];
	 for(i=0;i<n;i++){
		 arr[i]=sc.nextInt();
	 }
	 for(i=0;i<n;i++){
		 
		 for(j=0;j<=i;j++){
			 if(arr[j]>arr[i])
			 {
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
	 }
	}
	 System.out.println("Sorted array");
	 for(i=0;i<n;i++){
		 System.out.print(arr[i]+" ");
	 }
   }
}
