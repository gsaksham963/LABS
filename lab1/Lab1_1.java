package lab1;
import java.util.*;
class FindSum{
  /**
 * @author Saksham
 */
  int sum=0;
  public int calculateSum(int n){
   for(int i=0;i<=n;i++){
     if( (i%3==0 || i%5==0) )
	   sum+=i;
   }
   return sum;
  }
}
public class Lab1{
	 public static void main(String st[]){
	  FindSum a=new FindSum();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.calculateSum(n));
	  sc.close();
  }
}