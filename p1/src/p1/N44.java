package p1;
import java.util.Scanner;
public class N44 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n values");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
