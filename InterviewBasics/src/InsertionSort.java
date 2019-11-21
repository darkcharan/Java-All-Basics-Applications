
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={12,10,5,2,9,30};
		int temp=0;
		
		System.out.println("before insertion sort");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
		
	for (int i = 1; i <ar.length; i++) 
	{
	for(int j = i ; j > 0 ; j--)
	{
    if(ar[j] < ar[j-1]){
	temp = ar[j];
    ar[j] = ar[j-1];
    ar[j-1] = temp;
    }
	}
	}
	 	System.out.println("after insertion sort");
		for(int k=0;k<ar.length;k++)
		{
			System.out.print(ar[k]+" ");
		}
		System.out.println("");
		}

	

}
