
public class leftHalf {

	public static void main(String[] args) {
	//Print Left half Pyramid star Pattern
		
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=5-i;j++)//space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)//column
			{
			System.out.print("*");
		}
			System.out.println( );

		}
		System.out.println(" ");
		
		//Another way to print left half pyramid
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<5;j++)
			{
				if(j<i-1) 
					System.out.print(" ");
				else 
					System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();

		//Print Reverse Left half Pyramid star Pattern
		
				for(int i=1;i<=5;i++)//row
				{
					for(int j=1;j<=i-1;j++)//space
					{
						System.out.print(" ");
					}
					for(int k=1;k<=5-i+1;k++)//column
					{
					System.out.print("*");
				}
					System.out.println();

				}

				//Another way to print Reverse left half Pyramid
				for(int i=5;i>0;i--) {
					for(int j=1;j<=5;j++) {
						if(j<=5-i) {
						System.out.print(" ");
					}
						else {
						System.out.print("*");
					
						}
					
				}
					System.out.println();
					
				}
				System.out.println();
				// print K Pattern
				for(int i=1;i<=6;i++)
				{
					for(int j=6;j>=i;j--)
					{
						System.out.print("*");
					}
					System.out.println("");
				}
				for(int i=0;i<=5;i++)
				{
					for(int j=0;j<=i;j++)
					{
						System.out.print("*");
					}
					System.out.println("");
				}
				
				// Print 1,01,101 right triangle pattern
				for (int i=0;i<5;i++) {
					for(int j=0;j<=i;j++) {
						if((i+j)%2==0) {
							System.out.print("1 ");
						}
						else
						{
							System.out.print("0 ");
						}
					}
					System.out.println();
				}
				
	}

}
