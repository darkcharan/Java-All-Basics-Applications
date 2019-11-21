
public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int ar[]= {9,14,3,2,43,11,58,22};
		
		System.out.println("Before selection sort");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ " ");
		}
		System.out.println("");
				

		for(int i=0;i<ar.length;i++)
		{
			int index =i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[index])
				index=j;
			}
		
		int smallestnum=ar[index];
		ar[index]=ar[i];
		ar[i]=smallestnum;
	}//end of for loop

System.out.println("after selection sort");
for(int i=0;i<ar.length;i++)
{
	System.out.print(ar[i]+" ");
}
System.out.println("");
		
		
	}

}
