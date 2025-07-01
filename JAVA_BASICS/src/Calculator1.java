import java.util.*;

public class Calculator1 {

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();

        int x = 20, y = 5;

        calc.add(x, y);
        calc.sub(x, y);
        calc.multiply(x, y);
        calc.div(x, y);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        int input=sc.nextInt();
        System.out.println(input);
    }
}