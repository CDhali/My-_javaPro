package inherit;
                  // parent is the super class also this one is sub class when is child to c and c is the super class.
public class B extends C{ // that means A will get everything from B and c. one class extends one at a time.

	static int a = 44;
	int b = 22;
	
	public static void B1() { 
		System.out.println("B1");
		System.out.println(a+100);
	}
	
	
	public  void B2() { 
		System.out.println("B2");
	}

}
