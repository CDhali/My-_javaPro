package encapsulation;

public class A {
             // encapsulation means hidden data..
	
	public static void main(String[] args) {
		
		System.out.println(B.getA());
		B.setA(77);
		System.out.println(B.getA());
		B.setA(99);
		System.out.println(B.getA());
		
		

	}

	

}
