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
	char n=in.next().charAt(0);
	if((n>='A'&&n<='Z')||(n>='a'&&n<='z'))
	{System.out.println("alphabet");}
	else
	{System.out.println("not an alphabet");}
	}
}
