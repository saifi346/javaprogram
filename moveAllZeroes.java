package mine;

public class moveAllZeroes {

	public static void main(String[] args) {
		int a[]={1,2,0,4,3,0,5,0};
		int b[]=new int[8];
		int i,cnt=0;
		for(i=0;i<a.length;i++){
			
			if(a[i]!=0)
				b[cnt++]=a[i];
			
			
		}
		while(cnt<a.length)
			b[cnt++]=0;
		for(cnt=0;cnt<b.length;cnt++)
			System.out.print(b[cnt]);

	}

}
