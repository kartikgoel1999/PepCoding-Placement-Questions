/*1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.*/
import java.util.*;
class PythagoreanTriplet
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        //considering hypotenuse to be the longest side
		int max= c;
		if(b >=max)
			max = b;
		if(a >= max)
			max = a;
		if(max == c)
		{
			boolean flag =((a*a + b*b) == (c*c));
			System.out.println(flag);
		}
		else if(max == b)
		{
			boolean flag =((a*a + c*c) == (b*b));
			System.out.println(flag);
		}
		else
		{
			boolean flag =((c*c + b*b) == (a*a));
			System.out.println(flag);
		}
		
	}
}
