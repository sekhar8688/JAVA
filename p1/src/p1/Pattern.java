package p1;

public class Pattern {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++)
		{
			for (int k=1;k<i;k++)
			{
			 System.out.print("  ");
			}
			for(j=1;j<=2*(4-i)-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
