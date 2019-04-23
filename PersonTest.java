public class PersonTest{
	public static void main(String [] args){
		
	//Super class constructor
		Person person1 = new Person("Brad", "Pitt", "333-33-3333", "Los Angeles");
		
	//Sub-Class Constructor
		Teacher teacher = new Teacher("Ezgi", "Akar", "222-22-2222", "Texas", 3);
		
	//toString's for both objects
		System.out.printf("%s \n%s\n\n", "Displaying Person", person1.toString());
		System.out.printf("%s \n%s\n\n", "Displaying Teacher", teacher.toString());
	}
}