
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	Rectangle(double width,double length,String color){
		super(color); //call attribute color from Contructor method in Class Shape
		this.width=width;
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public double getKength() {
		return length;
	}
	@Override
	public double getArea() {
		return this.width*this.length;
		
	}
	@Override
	public String toString() {
		return "Rectangle[width = "+this.width+",length ="+this.length+","+super.toString()+"]";
	}

}
