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
	int a=0;
	while(n!=0)
	{
	a=a+(n%10);
	n=n/10;
	}
	System.out.println("The sum is" + a);
	}
}