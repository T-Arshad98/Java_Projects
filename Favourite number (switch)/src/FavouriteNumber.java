import java.util.Scanner;
public class FavouriteNumber
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("This code will tell you a fact aboutyourfavourite number");
		System.out.println("What is your favourite number?");
		int verse = myScanner.nextInt();
		
		switch (verse)
		{
		case 1:
			System.out.println("Jack and Jill.");
			break;
		case 2:
			System.out.println("Went up the hill.");
			break;	
		case 3:
			System.out.println("Went up the hill.");
			break;	
		case 4:
			System.out.println("Went up the hill.");
			break;
		case 5:
			System.out.println("Went up the hill.");
			break;
		case 6:
			System.out.println("Went up the hill.");
			break;
		case 7:
			System.out.println("There are 7 great wonders in the world, one of them is Niagra Falls");
			break;	
			
		}
		if (verse>=3)
		{
			System.out.println("this is not a verse");
		}
	}

}
