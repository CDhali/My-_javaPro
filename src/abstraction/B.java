package abstraction;
          // in a non abstract can't be abstract only one ..
         // An abstract methods can be abstract or non abstract can do both.....
         // abstract methods don't have the body.
          //Abstract methods never can't be static.
      // An Abstract class u can't make any object...

public abstract class B {
	
	
	 public static void B1() {
		 System.out.println ("B1");
	 }
	 
	 public void B2() {
		 System.out.println("B2");
	 } 
	  
	
	 
	 
	 public abstract void B3();// this is known as unimplemented
	 
	 
	 
	 public abstract void B3(int a, int b);
	 
	 
	 public abstract void openBrowser (String browserName);
 
}
