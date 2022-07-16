package Interface;

public class Fish implements Prey, Predator{

	@Override
	public void haunt() {
		System.out.println("This fish is haunting smaller fish");
	}

	@Override
	public void flee() {
		System.out.println("This fish is fleeing larger fish");
	} 
}