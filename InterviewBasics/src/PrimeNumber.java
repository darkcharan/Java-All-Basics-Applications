import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int n=sc.nextInt();
		int flag=0;		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
	           flag=1;
	           break;
			}
		}
		
			if(flag==0)
			{
				System.out.println("prime no");
			}
			else			
			{
				System.out.println("not a prime no");
			}
		}

}
