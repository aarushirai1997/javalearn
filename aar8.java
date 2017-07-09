/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in= new Scanner(System.in);
	int n=in.nextInt();
	int[] a= new int[5];
	int i,sum=0;
	for(i=0;i<n;i++)
	{ a[i] = in.nextInt();sum=sum+a[i];
	}
	System.out.println("The sum is"+sum);
	}
}