import java.util.Scanner;

public class falling {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double acceleration, time, velocityi, positioni;
		System.out.println("This will calculate the position of a falling object");
		
		System.out.println("What is the acceleration in m/s");
		Scanner acc = new Scanner(System.in);
		acceleration = acc.nextDouble();
		
		System.out.println("What is the time in s");
		Scanner t  = new Scanner(System.in);
		time = t.nextDouble();
		
		System.out.println("What is the initial velocity in m/s");
		Scanner v = new Scanner(System.in);
		velocityi = v.nextDouble();
		
		System.out.println("What is the initial position in m");
		Scanner x = new Scanner(System.in);
		positioni = x.nextDouble();
		
		double result=0.5*acceleration*(time*time)+velocityi*time+positioni;
	System.out.println("Your final position is " + result + "metres");
	
	
	}

}
