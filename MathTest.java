package week05Lab;

public class MathTest {

	public static void main(String[] args) {
		
		//instantiating the different implemented classes
		
		MathOperation add = new AdditionOperation(); 
		MathOperation subtract = new SubtractionOperation();
		MathOperation multiply = new MultiplicationOperation();
		MathOperation divide = new DivisionOperation();
		
		//Printing out the results
		System.out.println("Printing out the results:");
		System.out.println("Addition: " + add.evaluate(15, 5)); //20
		System.out.println("Subtraction: " + subtract.evaluate(15, 5)); //10
		System.out.println("Mutliplication: " + multiply.evaluate(15, 5)); //75
		System.out.println("Division: " + divide.evaluate(15, 5)); //3
		
		
		//NOTES
		//Instead of creating different classes (Addition, Subtraction, etc.), we could define
		//operations in-line using lambda functions instead.
		//The interface in MathOperation remains the same
		//More readable & concise (directly defining new operations on the fly)
		//less boilerplate code (no need for separate classes)
		//Flexibility - easily extend by defining operations on the fly, like Power below
		
		MathOperation add1 = (a, b) -> a + b;
		MathOperation subtract1 = (a, b) -> a - b;
		MathOperation multiply1 = (a, b) -> a * b;
		MathOperation divide1 = (a, b) -> {
			if (b==0) throw new ArithmeticException("Cannot divide by zero.");
			return a / b;
		};
		MathOperation power = (a, b) -> Math.pow(a, b);
		
		
		System.out.println("\nSame operations using lambda functions: ");
		
		System.out.println("Addition: " + add1.evaluate(20, 4));
		System.out.println("Subtraction: " + subtract1.evaluate(20, 4));
		System.out.println("Multiplication: " + multiply1.evaluate(20, 4));
		System.out.println("Division: " + divide1.evaluate(20, 4));
		System.out.println("Exponentiation: " + power.evaluate(4, 2));
		
	
		

	} //end of main

} //end of class