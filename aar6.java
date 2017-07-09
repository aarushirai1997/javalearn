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
	
if(n%4==0)
	
{if(n%100==0)
{if(n%400==0)System.out.println("It is a leap year");
	else
	System.out.println("It is not a leap year");}


else System.out.println("It is a leap year");}
else System.out.println("It is not a leap year");
	}

}
