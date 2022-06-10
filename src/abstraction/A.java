package abstraction;

 //public abstract class A extends B{ // this approach not ganna work because when u abstract x class is showing error remember we can't make object in abstract. also x class created before A extends B. So we need to find the another approach.

public  class A extends B{
	
	public static void main(String[] args) {
		B.B1();
		/*B objB = new B();// here is  methods not ganna work because this is an abstract methods. 
		objB.B2();
		objB.B3();*///
		////****if there is class that exgiest non abstracted and trying to inherit abstracted class it need to overwrite. 
	}
		
		public void test() {
			 System.out.println("abc");
		 }

		@Override // when A extends B...B3 get implemented... because this is how non-abstracted dealing with abstract...
		public void B3() {
			System.out.println("this is my B3 version");
			
			
		}

		@Override
		public void B3(int a, int b) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void openBrowser(String browserName) {
			// TODO Auto-generated method stub
			
		}	
		 
	}


