import java.util.Scanner;

public class SecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  int n,i,j=0,lrg,lrg2nd;
		  int arr1[]=null;
		  System.out.printf("\n\nFind the second largest element in an array :\n");
		  System.out.printf("-------------------------------------------------\n");  
	  
	      System.out. printf("Input the size of array : ");
	      Scanner sc=new Scanner(System.in);
	    /* Stored values into the array*/

	      
	      n=sc.nextInt();
	      arr1=new int[n];
	      System.out.printf("Input %d elements in the array :\n",n);
	      for(i=0;i<n;i++)
	            {
		      
		      arr1[i]=sc.nextInt();
		    }
	/* find location of the largest element in the array */		
	//   lrg=arr1[0];
	   lrg=0;
	  for(i=0;i<n;i++)
	  {
	      if(lrg<arr1[i])
		  {
	           lrg=arr1[i];
	           j = i;
	      }
	  }

	/* ignore the largest element and find the 2nd largest element in the array */		
	   lrg2nd=0;
	  for(i=0;i<n;i++)
	  {
	     if(i==j)
	        {
	          i++;  /* ignoring the largest element */
			  i--;
	        }
	      else
	        {
	          if(lrg2nd<arr1[i])
		     {
	               lrg2nd=arr1[i];
	             }
	        }
	  }

	  System.out.printf("The Second largest element in the array is :  %d \n\n", lrg2nd);
	}

	}


