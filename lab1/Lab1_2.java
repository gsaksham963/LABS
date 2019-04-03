package lab1;
import java.util.*;
class Calculate{
/**
 * @author Saksham
 */

   int sum=0,squareSum=0,sumSquare=0;
  public int calculateDifference(int n){
   for(int i=1;i<=n;i++){
	   sum+=i;
	   squareSum+=(i*i); 
   }
    sumSquare=sum*sum;
   return (squareSum-sumSquare);
  }
}
public class Lab2{
	 public static void main(String st[]){
	  Calculate a=new Calculate();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.calculateDifference(n));
	  
  }
	
}