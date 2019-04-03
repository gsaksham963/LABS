package lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab6_1 {

/**
 * @author Saksham	
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		String s="12c sjs 22  j33 44 y";
		int sum=0;
		StringTokenizer s1=new StringTokenizer(s);
		
		while(s1.hasMoreTokens())
		{
			Integer a=0;
			try
			{
				a=Integer.parseInt(s1.nextToken());
			}
			catch(Exception e)
			{
				
			}
			
			if(a instanceof Integer)
			{
				sum+=a;
			}
		}
		System.out.println("sum is-"+sum);
	}
}
