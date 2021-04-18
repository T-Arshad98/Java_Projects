import java.util.Scanner;

public class test 
{

	public static void main(String[] args) 
	{
		System.out.println("What is your value");
		
		double val1;
		Scanner v=new Scanner(System.in);
		val1 = v.nextInt();
		
		if (val1>5)
		{
			System.out.println(val1+" is > 5.0");
		} 
		else if (val1==5)
		{
			System.out.println(val1+" equals 5.0");
		}
		else
		{
			System.out.println(val1+" is < 5.0");
		}
	}
}
