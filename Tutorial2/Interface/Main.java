package Interface;

public class Main{
	public static void main(String[] args) {
		 Rabbit rabbit = new Rabbit();
		 Hawk hawk = new Hawk();
		 Fish fish = new Fish();
		 
		 rabbit.flee();
		 System.out.println();
		 hawk.haunt();
		 System.out.println();
		 fish.flee();
		 fish.haunt();
	}
}