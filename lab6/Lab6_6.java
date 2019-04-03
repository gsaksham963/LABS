package lab6;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Lab6_6 {

/**
 * @author Saksham	
 */

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println("Enter date in format DD-MM-YYYY");
		String s=new Scanner(System.in).next();
		String []arr=s.split("\\-");
		if((Integer.parseInt(arr[2])-(c.get(Calendar.YEAR)))>0)
		{
			System.out.println("Invalid date");
		}
		else
		{
			System.out.println("Duration is");
			
			System.out.println("days: "+(Integer.parseInt(arr[0])-(c.get(Calendar.DATE))));
			System.out.println("months: "+(Integer.parseInt(arr[1])-c.get(Calendar.MONTH)+1));
			System.out.println("year: "+(Integer.parseInt(arr[2])-(c.get(Calendar.YEAR))));	
		}	
	}
}
