import java.util.Scanner;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is maximum then b");
		}
		else
		{
			System.out.println("a is minimum then b");
		}
		
		int max=Math.max(a,b);
		System.out.println("Maximum number"+max);
		
		

		int c=sc.nextInt();
		int d=sc.nextInt();
		if(c>d)
		{
			System.out.println("c is maximum then d");
		}
		else
		{
			System.out.println("c is minimum then d");
		}
		
		int min=Math.min(c, d);
		System.out.println("Minimun number");

	}

}
