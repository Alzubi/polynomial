package q_a_test;

//		5x^3   +              2x     -   3
//	=> (5x^3)  +             (2x)    -  (3)
//	=> (5x^3)  +  (0x^2)  +  (2x^1)  -  (3x^0)


public class Polynomial {

	private int degree;
	private int[] coefficients;
	

	public Polynomial(int degree){
		this.degree=degree;
		coefficients = new int[degree+1];
	}
	
	public void setCoefficient(int deg,int coef){
		this.coefficients[deg]= coef;
	}
		
	
    public double evaluate(double x) {
    	double ret=0.0;

        for (int i = 0; i <= degree; i++)
        	ret=ret +  coefficients[i]* Math.pow(x, i);
        
        return ret;
    }
    
	
}


