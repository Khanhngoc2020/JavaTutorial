package CopyObject;

public class Car {
	private String Name;
	private String Model;
	private int Year;
	
	Car(String n, String m, int y){
		this.Name = n;
		this.Model = m;
		this.Year = y;
	}
	
	Car(Car x){
		this.copy(x);
	}
	
	public void copy(Car x) {
		this.setName(x.getName());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
	
	public int getYear() {
		return Year;
	}
	public String getName(){
		return Name;
	}
	public String getModel() {
		return Model;
	}
	
	public void setName(String name){
		this.Name = name;
	}
	public void setModel(String model) {
		this.Model = model;
	}
	public void setYear(int year) {
		this.Year = year;
	}
	
	
	

}