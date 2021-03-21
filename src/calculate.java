import java.util.Scanner;

public class calculate {
    int a, b, sum, diff, product, quotient;

    void input() {
        System.out.println("Enter two values");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }

    int add() {
        sum = a + b;
        return (sum);
    }

    int sub() {
        diff = a - b;
        return (diff);
    }

    int multiply() {
        product = a * b;
        return (product);
    }

    int divide() {
        quotient = a / b;
        return (quotient);
    }
}

class CRun {
    public static void main(String[] args) {


        calculate c = new calculate();
        c.input();
        System.out.println("Sum = " + c.add());
        System.out.println("Difference = " + c.sub());
        System.out.println("Product = " + c.multiply());
        System.out.println("Quotient = " + c.divide());
    }
}
