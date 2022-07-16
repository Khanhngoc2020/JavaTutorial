package Encapsulation;

public class TextA {
	public String Name;
	private String Dob;
	private int Grade;
	public String something; 
	
	TextA(){}
	
	TextA(String n, String d, int grade, String s){
		this.Name = n;
		this.Dob = d;
		this.Grade = grade;
		this.something = s;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public void show_information() {
		System.out.println(getName());
		System.out.println(getDob());
		System.out.println(getGrade());
	}
	public String getName() {
		return Name;
	}
	public String getDob() {
		return Dob;
	}
	public int getGrade() {
		return Grade;
	}
}
