public abstract class Shape{
	
	//instance variables
	private int height;
	private int width;
	
	//constructor
	public Shape(int height, int width){
		
		if(height < 0){
			throw new IllegalArgumentException("Height must be greater than Zero(0)");
		}
		
		if(width < 0){
			throw new IllegalArgumentException("Width must be greater than zero(0)");
		}
		
		this.height = height;
		this.width = width;		
	}
	
/** Set Methods **/
	
	public void setHeight(int height){
		if(height < 0){
			throw new IllegalArgumentException("Height must be greater than Zero(0)");
		}
		
		this.height = height;
	}
	
	public void setWidth(int width){
		if(width < 0){
			throw new IllegalArgumentException("Width must be greater than zero(0)");
		}
		
		this.width = width;
	}
	
/** Get Methods **/
	
	public int getHeight(){
		return height;
	}
	
	public int getWidth(){
		return width;
	}
	
/** Abstract Method **/
	
	public abstract double getArea();

/** Overrided Classes **/
	
	@Override
	public String toString(){
		return String.format("%s: %d\n%s: %d", "Height", getHeight(), "Width", getWidth());
	}
}