package encapsulation;
    // private is ganna work in the same class only so how we ganna take to the main methods????

public class B {
	private static int a = 10;
	private String b = "brave";
	
	public static int getA() {
		return a;// this is how we can use the private modifiers value  to the another class. 
	}     // getter 

	public static void setA(int newValue) {
		a = newValue;// here one a is global and another one is local..the right one is the local and the left one is the global.......  this is how we can use our own variables...
	}  // setter
	
	//public static void setA(int a)
	 //B.a = a /// if the variables name is as global variables name in that case we can use the class name before the (a) means variables name.
	
	
	public  String getB() {
		return b; 
	}
	
	public void setB(String a) {
		this.b = b ; // just because this is a non static we need to creating an object but using keyword "this" we can get rid of it.
	
	// right click + source + general getter and setter doing this can able to get auto getter and setter.
	}
	
	
	
	
}
