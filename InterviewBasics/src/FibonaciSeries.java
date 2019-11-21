import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("fibonaci series");
		int n=sc.nextInt();
		System.out.println("fibonaci series of"+"\t"+n+ " \t" + "number");
		for(int i=1;i<=n;i++)
		{
			System.out.println(num1+"");
			int sumofprevious=num1+num2;
			num1=num2;
			num2=sumofprevious;
		}

	}

}
