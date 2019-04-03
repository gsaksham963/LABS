package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lab6_2 {

/**
 * @author Saksham	
 */

	public static void main(String []args) throws IOException
	{
		Scanner sc=new Scanner(new File("D:\\JAVA\\programs\\java.txt"));
		int i=1;
		while(sc.hasNextLine())
		{
			System.out.println("Line "+i+"- "+sc.nextLine());
			i++;
		}
	}
}
