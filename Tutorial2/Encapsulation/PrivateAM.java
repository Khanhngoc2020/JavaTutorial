package Encapsulation;

public class PrivateAM {

	public static void main(String[] args) {
		TextA student = new TextA("Hoai Thu", "12/09/2002", 12, "ngoc ngoc nghech");
		TextA student1 = new TextA();
		
		String s = student.something;
		System.out.println(s);
		String name = student.Name;
		System.out.println(name);  
		
		student1.setName("Ngoc Tuan");
		System.out.println(student1.getName());
		
		student.show_information();
	
	}

}
