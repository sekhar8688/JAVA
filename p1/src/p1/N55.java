package p1;
import java.util.Scanner;
public class N55 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n value");
		int n = scan.nextInt();
		for (int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
