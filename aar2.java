/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class evenodd
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in= new Scanner(System.in);
	int n= in.nextInt();
	if(n%2==0)
	System.out.println("Even");
	else if(n%2!=0)
	System.out.println("Odd");
	else
	System.out.println("Invalid Input");
	}
}