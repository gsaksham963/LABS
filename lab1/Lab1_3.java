package lab1;
import java.util.Scanner;
public class Lab1_3 {
/**
 * @author Saksham
 */
	public boolean checkNumber(int n)
	{
		int r=9,sum=0,sum1=0,flag=0;
		while(n>0)
		{
			if(r< n%10)
			{
				flag=1;
				break;
			}
			else
			{
				r=n%10;
				n=n/10;
			}
		}
		if(flag==1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1_3 obj=new Lab1_3();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(obj.checkNumber(n))
		{
			System.out.println("No is increasing");
		}
		else
		{
			System.out.println("No is not increasing");
		}
		sc.close();
	}

}
