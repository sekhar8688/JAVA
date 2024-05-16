package p1;
import java.util.Scanner;
public class m233 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n values");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
		System.out.println();

		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		char count='A';
		for(int i=1;i<=n;i++)
		{
			
			if(i%2==0)
			{
				char charRev=(char)(count+i-1);
				for(int j=1;j<=i;j++)
				{
					System.out.print(charRev-- + " ");
					count++;
				}
				System.out.println();
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(count++ + " ");
				}
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
