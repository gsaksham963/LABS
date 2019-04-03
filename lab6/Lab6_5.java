package lab6;

import java.util.Scanner;

public class Lab6_5 {

/**
 * @author Saksham	
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).nextLine();
		int flag=0;
		for(int i=1;i<s.length();i++)
		{
			if((int)s.charAt(i)<(int)(s.charAt(i-1)))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("not positive");
		}
	}

}
