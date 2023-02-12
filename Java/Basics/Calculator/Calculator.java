/*
* A basic calculator Program
*/

// Calculator Class
public class Calculator {

    // Constructor
    public Calculator() {

    }

    // Add method
    public int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    // Subtract method
    public int subtract(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    // Multiply method
    public int multiply(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    // divide method
    public int divide(int numOne, int numTwo) {
        return numOne / numTwo;
    }

    // modulo method
    public int modulo(int numOne, int numTwo) {
        return numOne % numTwo;
    }

    // main method
    public static void main(String[] args) {
        // Instantiating a calculator object
        Calculator myCalculator = new Calculator();

        // method calls
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.modulo(45, 11));
        System.out.println(myCalculator.multiply(45, 11));
        System.out.println(myCalculator.divide(45, 11));
    }
}