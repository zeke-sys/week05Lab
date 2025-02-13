package week05Lab;

public class DivisionOperation implements MathOperation {

	@Override
	public double evaluate(double a, double b) {
		if (b==0) {
			throw new ArithmeticException("Cannot divide by zero.");
		}
		return a / b;
	}
	

} //end of class
