
public class MaxMinUsingArray 
{
	
public static int getsecondMaxValue(int[] numbers)
{
	int secondmaxvalue=numbers[1];
	for(int i=2;i<numbers.length;i++)
	{
		if(numbers[i]>secondmaxvalue)
		{
			secondmaxvalue=numbers[i];
		}
	}
	return secondmaxvalue;
		}
public static int getsecondMinValue(int[] numbers)
{
	int secondminvalue=numbers[1];
	for(int i=2;i<numbers.length;i++)
	{
		if(numbers[i]<secondminvalue)
		{
			secondminvalue=numbers[i];
     }
}
    return secondminvalue;
}
    public static void main(String[] args)
    {
    	int numbers[]={10,20,30,40,50,2,9,10};
    	System.out.println("minimum second value = "+ getsecondMinValue(numbers));
    	System.out.println("maximun second value = "+ getsecondMaxValue(numbers));
    }
}