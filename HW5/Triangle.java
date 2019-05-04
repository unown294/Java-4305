public class Triangle extends Shape{
	
	//Instance value
	private String classification;
	
/** Constructor **/

	public Triangle(int height, int width, String classification){
		super(height, width);
		
		this.classification = classification;
	}
	
/** Set Method **/
	
	public void setClassification(String classification){
		this.classification = classification;
	}
	
/** Get Method **/
	
	public String getClassification(){
		return classification;
	}

/** Overide methods **/
	
	@Override
	public double getArea(){
		return (super.getHeight()*super.getWidth()/2);
	}
	
	@Override
	public String toString(){
		return String.format("%s\n%s\n%s\n%s: %s\n%s: %.2f",  "Triangle", "****************", super.toString(), "Classification", getClassification(), "Area", getArea());
	}
}