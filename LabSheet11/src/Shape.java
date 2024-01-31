
public abstract class Shape {
	private String color;
	
	Shape(String color){
		this.color = color;
	}
	Shape(){
		this.color = null;
	}
	public String toString() {
		return "Color= "+this.color;
	}
	
	//abstract Method
	public abstract double getArea();
	
}
