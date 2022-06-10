package inherit;
                 // Child is the sub class.
public class A extends B { //  for exemple: A is the child and B is the parent so a is ganna get everything B have 

	public static void main(String[] args) {
		//static
		A.A1();
		A.B1();// because A extends B so A can have whatever B have. thats why A call B without needing B class name.
		
		//non-static
		
		A objA = new A();// A extends  B that means a have B stuff as a result one object can call the other methods.
		objA.A2();
		objA.B2(); // i can't call b to a coz A extends B.
		
		System.out.println(A.a);
		A.a = 5;
		B1();
		
	}
		public static void A1() { 
			System.out.println("A1");
		}
		
		
		public  void A2() { 
			System.out.println("A2");
		}
		
	}


