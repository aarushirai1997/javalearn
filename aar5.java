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
	int a= in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	if(a>b&&a>c)
	System.out.println("This is the largest"+a);
	else if (a<b&&c<b)
	System.out.println("This is the largest"+b);
	else if(c>a&&c>b)
	System.out.println("This is the largest"+c);
	}
}