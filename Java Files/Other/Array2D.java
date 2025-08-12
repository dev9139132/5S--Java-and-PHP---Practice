import java.util.Scanner;

public class Array2D
{
		public static void main(String[] args)
		{
				//2D Array
				int[][] arr = new int[2][3];
				
				//Initialization
				/*for(int i=0;i<2;i++)
				{
					for(int j=0;j<3;j++)
					{	
						arr[i][j] = j+1;
					}
				}*/
				
				Scanner input = new Scanner(System.in);
				
				for(int i=0;i<2;i++)
				{	System.out.println();
					for(int j=0;j<3;j++)
					{	
					System.out.print("Enter the value at index ["+i+","+j+"]: ");
						
						// One approach of storing value from input in an array:
						/*int x = input.nextInt();
						arr[i][j] = x;*/
						
						// Another approach
						arr[i][j] = input.nextInt();
	
					}
				}
				
				//Travering
				System.out.println();
				System.out.println("2D Array: ");
				for(int i=0;i<2;i++)
				{	
					System.out.println();
					System.out.print("  ");
					for(int j=0;j<3;j++)
					{	System.out.print(" ");
						System.out.print(arr[i][j]);
					}
					
				}
				
				System.out.println();
				
		}
	
}