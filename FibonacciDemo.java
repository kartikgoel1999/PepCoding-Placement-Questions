// 1. You've to print first n fibonacci numbers.
//   2. Take as input "n", the count of fibonacci numbers to print.
//   3. Print first n fibonacci numbers.
import java.util.*;
class FibonacciDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c,a=0,b=1;
		for(int i=1;i<=n;i++){
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
		}		
	}
}