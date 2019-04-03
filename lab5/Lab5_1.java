package lab5;

import java.util.Scanner;

public class lab5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).next();
		if(s.equalsIgnoreCase("red"))
		{
			System.out.println("STOP!!");
		}
		else if(s.equalsIgnoreCase("yellow"))
		{
			System.out.println("READY!!");
		}
		else if(s.equalsIgnoreCase("green"))
		{
			System.out.println("GO!!");
		}
	}
}
