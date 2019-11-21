import java.util.Scanner;

public class ArraySortingAndDescending 
{

static void ascending(int a[])
{
	
	int temp=0;
	for (int i = 0; i < a.length; i++)   
    {  
for (int j = i + 1; j < a.length; j++)   
    {  
     if (a[i] > a[j])   
            {  
        temp = a[i];  
        a[i] = a[j]; 
        a[j] = temp;  
            }  
        }  
    }
	
	System.out.println(" Sorting ArrayElements in asending order");
	for(int k=0;k<a.length;k++)
	{
		System.out.print(a[k]+"\t");
	}
	System.out.println("");	

}
	
static void dscending(int a[])
{
	int temp=0;
	System.out.println(" Sorting ArrayElements in desending order");
	for (int i = 0; i < a.length; i++)   
    {  
for (int j = i + 1; j < a.length; j++)   
    {  
     if (a[i] < a[j])   
            {  
        temp = a[i];  
        a[i] = a[j]; 
        a[j] = temp;  
            }  
        }  
    }
	
	System.out.println("");
	for(int k=0;k<a.length;k++)
	{
		System.out.print(a[k]+"\t");
	}
}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				
System.out.println("Enter How many Array elements U want to Read");
int n=sc.nextInt();
System.out.println("Enter Array Elements");
int ar[]=new int[n];
for(int i=0;i<ar.length;i++)
{
	ar[i]=sc.nextInt();
}
System.out.println(" Before Sort Array Elements");

for(int k=0;k<ar.length;k++)
{
	System.out.print(ar[k]+"\t");
}
System.out.println("");
ascending(ar);
dscending(ar);


	}

}
