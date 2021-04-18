import java.util.Scanner;

public class triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		double length1, length2;
		Scanner l = new Scanner(System.in);
		
		System.out.println("This will determine the hypotenuse of a triangle");
		
		System.out.println("What is the first length in m");
		length1 = l.nextDouble();
		
		System.out.println("What is the second length in m");
		length2 = l.nextDouble();
		
		double result=Math.sqrt(length1*length2);
		
		System.out.println("The hypotenuse is " + result + " metres");
		

	}

}
