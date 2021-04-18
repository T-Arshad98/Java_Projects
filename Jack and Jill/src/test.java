import java.util.Scanner;
public class test 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Choose a verse number");
		int verse = myScanner.nextInt();
		
		switch (verse)
		{
		case 1:
			System.out.println("Jack and Jill.");
			break;
		case 2:
			System.out.println("Went up the hill.");
			break;	
		}
		if (verse>=3)
		{
			System.out.println("this is not a verse");
		}
	}

}
