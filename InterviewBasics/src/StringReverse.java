import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String name=sc.next();
		int lang=name.length();
		String reverse="";
		for(int i=lang-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
