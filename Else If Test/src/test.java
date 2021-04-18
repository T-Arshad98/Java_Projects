
public class test 
{
	public static void main(String[] args) 
	{
		test(6);
		test(5);
		test(4);
		test(3);
		test(6.5);
		test(2.2);
	}
	public static void test(double x)
	{
		if (x>5)
		{
			System.out.println(x+" is > 5.0");
		} 
		else if (x==5)
		{
			System.out.println(x+" equals 5.0");
		}
		else
		{
			System.out.println(x+" is < 5.0");
		}
	}
}
