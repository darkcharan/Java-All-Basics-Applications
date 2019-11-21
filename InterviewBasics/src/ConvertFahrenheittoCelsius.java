import java.util.Scanner;

public class ConvertFahrenheittoCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temperature;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter temperature in fahrenheit");
		temperature =sc.nextInt();
		temperature=((temperature-32)*5)/9;
		
		System.out.println("temperature is"+temperature);
	}

}
