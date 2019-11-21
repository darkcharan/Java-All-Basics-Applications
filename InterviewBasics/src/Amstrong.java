import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("check given number is amstrong or not");
		int n=sc.nextInt();
		a=n;b=0;c=0;
		
		while(a!=0)
		{
			b=a%10;
			a=a/10;
			c=c+b*b*b;
		}
		if(c==n)
		{
			System.out.println(" given number is  amstrong");
		}
		else
		{
			System.out.println("given number is  not amstrong");
		}

	}

}
