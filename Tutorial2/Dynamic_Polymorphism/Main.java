package Dynamic_Polymorphism;

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
	
		Gendel characters;
		System.out.println("Choose your characters: ");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("Boy")) {
			characters = new Boys();
			characters.character();
		}
		else if(choice.equalsIgnoreCase("girl")) {
			characters = new Girls();
			characters.character();
		}else {
			System.out.println("You have to choose your character");
        }
        
		/*	
		if(choice == 1) {
			characters = new Boys();
			characters.character();
		}
		else if (choice == 2) {
			characters = new Girls();
			characters.character();
		}else {
			characters = new Gendel();
			characters.character();
		}
		*/
	}
}