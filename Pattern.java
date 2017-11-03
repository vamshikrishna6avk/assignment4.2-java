/*program for printing pattern abc*/

package patternabc;
//Package is a grouping of related types providing access protection and name 
//created package as patternabc
import java.util.Scanner;
//import scanner class is in util folder inside the java folder
//util contains utility classes
//scanner is a predefined class for taking inputs from user
public class Pattern {//created class as pattern
			
	public static void main(String[] args) {

		
		int j;//initializing j
		 Scanner sc=new Scanner(System.in);
		//to scan values which we initialize
		 System.out.print("Enter N:\n");
		
			
		 int n=sc.nextInt();
		//scans next token of the input as int
		 for(int i=1;i<=n;i++)//using for loop
		{
			for (j=1;j<=(n+1)-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				/*if statement executes a single statement or a block of statements if a boolean expresion evaluates to true
			       boolean expression a java expression that when evaluated,returns a boolean value true or false,conditional statements such as if,whileand switch*/
				if(j<=i)
					System.out.print((char)(char)(j+64)+" ");//for printing values and parallely
			//looking into ASCII code and convert them into given alphabets
								else
									System.out.print((char)(char)(2*i-j+64)+" ");//
									System.out.println();
						}
		
		 for(int i=n-1;i>=1;i--)//initializing values in for loop
			{
				for (j=1;j<=(n+1)-i;j++)//intializing
					System.out.print(" ");
					for(j=1;j<=2*i-1;j++)
				//here it will take the value and jumps into the next line		
					if(j<=i)//jless than or equal to i
						System.out.print((char)(char)(j+64)+" ");
					else
				
						System.out.print((char)(char)(2*i-j+64)+" ");
						System.out.println();//system is used to return code
                        //out is a static member
                        //println is used to print text and gives output

			}	
	}	 
}