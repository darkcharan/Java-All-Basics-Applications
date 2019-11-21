import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check the given number is even or odd");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("given no is even number");
		}
		else
		{
			System.out.println("given no is odd number");
		}

	}

}
