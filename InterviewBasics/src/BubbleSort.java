

public class BubbleSort
{
	static void BubbleSort(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				 if (a[i] < a[j])   
		            {  
		        temp = a[i];  
		        a[i] = a[j]; 
		        a[j] = temp;
			}
		}
	}
		
	}
		  public static void main(String[] args) 
		  {  
              int a[] ={3,60,35,2,45,320,5,500};  
               
              System.out.println("Array Before Bubble Sort");  
              for(int i=0; i<a.length; i++)
              {  
                      System.out.print(a[i] + " ");  
              }  
              System.out.println();  
	
              BubbleSort(a);
              System.out.println("Array After Bubble Sort");  
              for(int i=0; i<a.length; i++)
              {  
                      System.out.print(a[i] + " ");  
	
                  }
	}
}
