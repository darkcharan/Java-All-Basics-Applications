import java.util.Scanner;

public class SortingAscendingDescending {
	static void ascending(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorting the elements in Ascending order");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+"\t");
		}
		System.out.println("");
		
	}
	
	static void descending(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorting elements in Descending order");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+"\t");
		}
		System.out.println("");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements to sort");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("before sorting array elements");
		for(int k=0;k<ar.length;k++)
		{
			System.out.print(ar[k]+"\t");
		}
		System.out.println("");
        ascending(ar);
        descending(ar);
	}

}
