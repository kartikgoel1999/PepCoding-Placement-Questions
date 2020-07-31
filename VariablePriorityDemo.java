class VariablePriorityDemo 
{
	public static void main(String[] args) 
	{
		int x = 15;
		int y = 10;
		int exp = x * y/x+y;
		System.out.println(exp);
	}
}
/*
Priority of * % / > + -
if same priority it calculates from left to right in order*/