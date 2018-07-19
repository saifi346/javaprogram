package mine;

public class largestThreeElement {

	public static void main(String[] args) {
		int a[]={10,4,3,50,23,90};
		int i,j,len,temp,count=0;
		for(i=0;i<a.length;i++)
			count++;
		len=count;
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("largest three elements are ");
		for(i=0;i<3;i++)
			System.out.print(a[i]+" ");

	}

}
