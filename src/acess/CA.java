package acess;

import inherit.C;

// public class CA {
	                // do not get confused to see like this,,, this class have different type of access medifiers..all the different type of class name...chack it carefully....... 
	
	              // public: that means access modifiers..........
	    // 4 Type of access modifier : public, private, protected, default.....
	         // if you are in the same class you call access any of those...
	
  /* public static void main(String[] args) {   Same class......same package
		A1();
		CA objca = new CA();
		objca.A2();
	}
	public static void A1() { 
		System.out.println("A1");
	}
	
	
	private  void A2() { 
		System.out.println("A2");
	}
	
	
	protected static void A3() {  // so it does not matter because u r in you own class sp u can make it public or protected or privet. 
		System.out.println("A1");
	}
	
	
	
	 static void A4() { 
		System.out.println("A1");// static default
	}	
	 
	 
	 void A5() { 
			System.out.println("A1"); //this is call non static default.
	 }	*/
	 
	
	///////// same package sub-class... subclass means extends another class....
	
	/*public class CA  extends B { //class name
		
		
		public static void main(String[] args) {   
			B1();
			B objB = new B();
			objB.B2();// make sure u change public, protected, default,private  from class B.
			
			// here beside the private all the access ganna work.
		}
		public static void A1() { 
			System.out.println("A1");
		}
		
		
		private  void A2() { 
			System.out.println("A2");
		}*/
		
		                  /////// same package non subclass.....
	 
	     //also here beside the private all the access ganna work
	 
	  /* public class CA{
	 public static void main(String[] args) {  // Same class......same package
			B.B1();
			B objB = new B();
			objB.B2();
		}
		public static void A1() { 
			System.out.println("A1");
		}
		
		
		private  void A2() { 
			System.out.println("A2");
		}
	 
	   }*/
		     // different package and subclass,,,,,,,.......
     //** here only public and protected  is ganna work...
     // private, default, is not ganna work here..


    import inherit.*;// for extends another package * means all the class including in the package. 
     
	 public class CA extends C{
	 
	 public static void main(String[] args) {  // Same class......same package
			
			C.C1();
			C objC = new C();
			//objC.C2();
			CA objc = new CA();
			objc.C2();
		}
		public static void A1() { 
			System.out.println("A1");
		}
		
		
		public  void A2() { 
			System.out.println("A2");
		}
}


                 /////// different package to non-subclass//////
/*public class CA { // only public is ganna work
	 
	 public static void main(String[] args) {  // Same class......same package
			
			C.C1();
			C objC = new C();
			objC.C2();
			
		}
		public static void A1() { 
			System.out.println("A1");
		}
		
		
		public  void A2() { 
			System.out.println("A2");
		}
}*/



		