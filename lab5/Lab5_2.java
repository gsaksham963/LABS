package lab5;

import java.util.Scanner;

public class Lab5_2 {
/**
 * @author Saksham
 */
	int a=1;
	int b=1;
	int c;
	public int Lab5_2(int x)
	{
		for(int i=1;i<=x;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
		}
		System.out.println();
		return 0;
	}
	
	
	public int Lab5_2r(int x)
	{
		if(x>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
			Lab5_2r(x-1);
		}
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=new Scanner(System.in).nextInt();
		Lab5_2 f=new Lab5_2();
		//without recursion
		f.Lab5_2(s);
		//with recursion
		f.Lab5_2r(s);
	}

}
