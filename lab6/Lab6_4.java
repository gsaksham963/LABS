package lab6;
import java.io.File;
import java.util.Scanner;
public class Lab6_4 {

/**
 * @author Saksham	
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).next();
		File f=new File("D:\\JAVA\\programs\\"+s);
		if(f.exists())
		{
			System.out.println("Yes file exists");
			if(f.canRead())
			{
				System.out.println("readable");
			}
			else
			{
				System.out.println("not readable");
			}
			if(f.canWrite())
			{
				System.out.println("writeable");
			}
			else
			{
				System.out.println("not writeable");
			}
			String []ss=f.getName().split("\\.");
			int n=ss.length;
			System.out.println("File Type -  "+ss[n-1]);
			System.out.println("Size of file- "+f.length()+" bytes");
		}
		else
		{
			System.out.println("doesn't exists");
		}
		
	}
}
