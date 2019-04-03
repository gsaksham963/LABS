package lab5;

import java.util.Scanner;

public class Lab5_4 {
/**
 *@author Saksham
 */
	void Enter(String s) throws Exception
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}

		if(count>1 || count==0)
		{
			
			throw new Exception("Enter name in correct format");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Name");
		String s=new Scanner(System.in).nextLine();
		Lab5_4 f=new Lab5_4();
		try {
			f.Enter(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
