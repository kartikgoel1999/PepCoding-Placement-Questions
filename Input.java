import java.util.*;
class Input 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		System.out.println("Dear"+name+"Here is the counting");
		for(int i=1;i<=n;i++){
		System.out.println(i);
		}
	}
}
/*NOTE
If program contains input from both Integer and String then use this
else if only int and string separatley have to be used then go with conventional method*/