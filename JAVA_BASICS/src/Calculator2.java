import java.util.*;

public class Calculator2 {

    public void add(int a, int b) {
        int valA=a;
        int valb=b;
        int result=a+b;
        System.out.println("Addition: " + result);
    }

    public void sub(int a, int b) {
        int valA=a;
        int valb=b;
        int result=a-b;
        System.out.println("Subtraction: " + result);
    }

    public void multiply(int a, int b) {
        int valA=a;
        int valb=b;
        int result=a*b;
        System.out.println("Multiplication: " + result);
    }

    public void div(int a, int b) {
        int valA=a;
        int valb=b;
        int result=a%b;
        System.out.println("modulus: " + result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int valueA = sc.nextInt();
        System.out.println("Enter second value");
        int valueB = sc.nextInt();
        Calculator2 calc = new Calculator2();
        calc.add(valueA, valueB);
        calc.sub(valueA, valueB);
        calc.multiply(valueA, valueB);
        calc.div(valueA, valueB);
    }
}