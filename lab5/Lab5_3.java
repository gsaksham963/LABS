package lab5;

import java.util.Scanner;

public class Lab5_2 {
/**
 * @author Saksham
 */

	void checkPrime(int a)
	{
		for(int i=2;i<a;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println(i+"\t");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=new Scanner(System.in).nextInt();
		Lab5_2 f=new Lab5_2();
		f.checkPrime(s);
	}

}
