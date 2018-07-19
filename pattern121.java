package mine;

public class pattern121 {

	public static void main(String[] args) {
		int i,j,k,space;
		for(i=1;i<=3;i++)
		{
			for(space=3;space>i;space--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			for(k=i-1;k>0;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
