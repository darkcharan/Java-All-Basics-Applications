import java.util.Scanner;

public class Palimdrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	     System.out.print("enter a number: ");
	     int n = sc.nextInt();
	     int sum = 0, r;
		 int temp = n;    
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)
	      
	        System.out.println("Given number is a Palindrome number.");    
	      
	        else 
	        
	        System.out.println("Given number is Not a palindrome");    
	        
	}

}
