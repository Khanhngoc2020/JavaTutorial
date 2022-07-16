package ExceptionHandling;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double z;
		try {
		System.out.println("Enter a whole number to divide: ");
		double x = sc.nextInt();
		
		System.out.println("Enter a whole number to be devided: ");
		double y = sc.nextInt();
		
		System.out.println(z = x/y);
		}
		
		catch(ArithmeticException e) {
			System.out.println("You can't devide by zero!");
		}
		
		//catch(InputMismatchException e) {
		//	System.out.println("PLEASE ENTER A NUUUMMMBERRRR");
		//}
		
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			sc.close();
		}
		
	}
		

}
