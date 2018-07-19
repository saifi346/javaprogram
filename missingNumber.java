package mine;

public class missingNumber {

	public static void main(String[] args) {
		int a[]={1,2,4,6,3,7,8};
        int i,n,j,count=0,sum;
        for(i=0;i<=a.length;i++){
        	count++;
        }
        n=count;
        sum=n*(n+1)/2;
       
        for(j=0;j<n-1;j++){
        	sum=sum-a[j];
        }
        System.out.println("missing number is "+sum);
	}

}
