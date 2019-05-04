public class ShapeTest{
	public static void main(String [] args){
		
		Triangle triangle1 = new Triangle(10, 5, "eclipse");
		Rectangle rectangle1 = new Rectangle(5, 10, "Blue");
		
		//Old print system to test the objects were being saved or functioning
		/*
		System.out.println();
		System.out.println(triangle1.toString());
		System.out.println();
		System.out.println(rectangle1.toString());
		*/
		
		//Object Array
		Shape [] shapes = new Shape[2];
		
		//Storing the objects
		shapes[0] = triangle1;
		shapes[1] = rectangle1;
		
		//Test to see if the object is either an instanceof and object Triangle or Rectangle
		for(Shape shape1: shapes){
			System.out.println(shape1);
				
			if(shape1 instanceof Triangle){
				System.out.println("This object is a Triangle Object");
			}
			else if(shape1 instanceof Rectangle){
				System.out.println("This object is a Rectangle Object");
			}
			else{
				System.out.println("Undefined Object / NULL Object");
				//Only prints if an object or row of the array isnt taken by an object
			}
			
			//Spaces the contents of the array out
			System.out.println();
		}
	}
}