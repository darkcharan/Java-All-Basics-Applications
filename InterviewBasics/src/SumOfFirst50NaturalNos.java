
public class SumOfFirst50NaturalNos {

	static void funA(int i) {
		int j=10;
		if(j>i)
		{
			
System.out.println(i);
funA(i+1);

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funA(0);
		/*int sum=0;
		int n=0;
		while(n<50)
		{
			sum=sum+n;
			n++;
			
		}
		System.out.println("sum:"+sum);
*/
	}

}
