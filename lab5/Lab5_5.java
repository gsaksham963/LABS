package lab5;

import java.util.Scanner;

public class Lab5_5 {
/**
 *@author Saksham
 */
	void EnterAge(int s) throws Exception
	{
		int count=0;
		if(s<19)
		{
			
			throw new Exception("Age should be more than 17");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab5_5 f=new Lab5_5();
		System.out.println("Enter Age");
		int i=new Scanner(System.in).nextInt();
		try {
			f.EnterAge(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
