/*
An array contains a group of variables/elements having same type
arrays are objects, so they are considered reference types
but elements of an array can be primitive or reference

We position an element in an array with its index

int [] myarray = new int [12];
int myarray [] = new int [12];

when an array is created, each of its elements receives a default value
int - 0, Strings - null, Boolean - false

myarray.length - it returns the length of an array
length is an instance variable - it is public and final

- length of this example array is 12
- the array will include 12 elements
- the index of the first element is 0
- the index of the last element is 11

String [] b = new String [100], x = new String [20];
String b [] = new String [100], x = new String [20]; - error / due to trying to make more than one array before having the syntax of [] before the name of the array

*/
import java.security.SecureRandom;

public class MyArray{
	private static final SecureRandom randomNumber = new SecureRandom();
	
	public static void main(String [] args){
		
		int [] array = new int [10];
		//Length of the array is 10
		
		System.out.printf("%s%8s\n", "Index", "Value");
		
		for(int x = 0; x < array.length; x++){
			array[x] = randomNumber.nextInt(1000);
		}
		
		for(int x =0; x < array.length; x++){
			System.out.printf("%5d%8d\n", x, array[x]);
		}
	}
}