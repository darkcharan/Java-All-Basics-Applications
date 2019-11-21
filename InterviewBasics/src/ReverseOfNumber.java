import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to reverse");
		 n=sc.nextInt();
		 while(n!=0)
		 {
			 reverse=reverse*10;
			 reverse=reverse+n%10;
			 n=n/10;
		 }
		 System.out.println("Reverse of number:"+reverse);
		 
	}

}
  



     