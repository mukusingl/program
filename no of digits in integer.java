import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=1234, r=0, c=0;
		while(n!=0)
		{
			r= n%10;
			c++;
			n=n/10;
		}
		System.out.println("the no. of digit is"+c);
	}
}