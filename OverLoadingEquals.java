//here we are testing the equivalence of objects coming from parent/child class.

public class OverLoadingEquals {
	private int value;

	public OverLoadingEquals(int value) { this.value = value; } //defining a constructor for the class

	//this is not the way to do it = overloading!!! Which "equals" gets called???
	
	public boolean equals(OverLoadingEquals o){  //passing object as a parameter
		System.out.print("OverLoadingEquals.equals() called  ");
		return (this.value == o.value); 
	}
	
	public static void main(String[]args){

		OverLoadingEquals o1 = new OverLoadingEquals(10);
		OverLoadingEquals o2 = new OverLoadingEquals(10);
		Object o3 = new OverLoadingEquals(10); //Object class is parent of all classes
      	Object o4 = new OverLoadingEquals(10);
      		
      	System.out.println(o1.equals(o2));     			// prints "true" checks the value inside two objects
      		
		System.out.println(o1.equals(o3)); //will match either	// prints "false" 
      	System.out.println(o1.equals((OverLoadingEquals) o3)); 	// prints "true" //converting o3 to child type
		
		System.out.println(o3.equals(o1)); //will match either	// prints "false"
		System.out.println(((OverLoadingEquals)o3).equals(o1)); // prints "true"
		
		System.out.println(((OverLoadingEquals)o3).equals(o4)); // prints "false"
		System.out.println(((OverLoadingEquals)o3).equals((OverLoadingEquals)o4)); 	// prints "true"



	}
	/*
	public boolean equals(Object o){ 
		System.out.print("Properly Overridden          ");
		return (this.value == ((OverLoadingEquals)o).value); 
	}
	*/
}
