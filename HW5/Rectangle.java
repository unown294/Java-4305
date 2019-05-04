public class Rectangle extends Shape{
	
	//Instance variable
	private String color;
	
	//Constructor
	public Rectangle(int height, int width, String color){
		super(height, width);
		
		this.color = color;
	}
	
/** Set Methods **/

	public void setColor(String color){
		this.color = color;
	}
	
/** Get Methods **/

	public String getColor(){
		return color;
	}
	
/** Override Methods **/

	@Override
	public double getArea(){
		return (super.getHeight()*super.getWidth());
	}
	
	@Override
	public String toString(){
		return String.format("%s\n%s\n%s\n%s: %s\n%s: %.2f", "Rectangle", "****************", super.toString(),"Color", getColor(), "Area", getArea());
	}
}