package lab6;

import java.util.Scanner;

public class Lab6_7 {

/**
 * @author Saksham	
 */

	public boolean validate(String s)
	{
		String userNamePattern="[A-Z a-z]{1}[a-z]{7,}\\_job";
		return s.matches(userNamePattern);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).next();
		Lab6_7 l=new Lab6_7();
		boolean b=l.validate(s);
		if(b)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
