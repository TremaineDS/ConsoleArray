package readstring;
import java.util.Scanner;
public class Console {

	public static void main(String[] args) {

			int Size, i;
			int positiveCount = 0, 
			negativeCount = 0,
			zeroCount = 0,
			sumCount = 0;
			
			Scanner sc = new Scanner(System.in);
			
			
			
			System.out.println("Please enter number of elements in an array : ");
			Size = sc.nextInt();
			
			int [] a = new int[Size];
			
			System.out.println("Please Enter " + Size + " elements of an Array: ");
			for (i = 0; i<Size;i++)
			{
				a[i] = sc.nextInt();
				
			}
			for(i=0;i< Size;i++)
			{
				if(a[i] >=0)
				{
					positiveCount++;
					
				}
				
				else
				{
					negativeCount++;
					
				}
				
				
				{
						zeroCount++;
						
			}
				{
					sumCount++;
				}
			}
						
						
						
					
					
				sc.nextInt();
				System.out.println("\n Total number of Positive numbers in Array is.." +positiveCount);
				
				System.out.println("\n Total number of Negative numbers in Array is.." +negativeCount);
					
				System.out.println("\n Total number of Zero values in Array is.." +zeroCount);
				
				
				System.out.println("\n Total number of Sum in Array is.." +sumCount);
				
				
				
			}
		
				}
	


