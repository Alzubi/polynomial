package q_a_test;

public class MainClass {

	public static void main(String[] args) {

		Polynomial myPoly = new Polynomial(3);
		myPoly.setCoefficient(3,5);
		myPoly.setCoefficient(1,2);
		myPoly.setCoefficient(0,-3);
		
		System.out.println(myPoly.evaluate(0));
		System.out.println(myPoly.evaluate(1));
		System.out.println(myPoly.evaluate(0.5f));
		
	}

}
