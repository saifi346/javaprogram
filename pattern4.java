package mine;

public class pattern4 {

	public static void main(String[] args) {
		int i,j,space;
		for(i=1;i<=5;i++)
		{
			for(space=5;space>i;space--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		

	}

}
