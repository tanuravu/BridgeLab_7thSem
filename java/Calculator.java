public class Calculator{
public static  void main(String[] args){
	int a = 10;
        int b = 20;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);
        System.out.println("Division (Quotient): " + quotient);
        System.out.println("Modulus (Remainder): " + remainder);
}}