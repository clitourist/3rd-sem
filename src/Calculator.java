import java.util.Scanner;

public class Calculator {
    public static void main(String []args){
        variables v2 = new variables();  // calling from other class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbeers");
        v2.a = sc.nextInt();
        v2.b = sc.nextInt();
        v2.sum = v2.a + v2.b;
        v2.diff = v2.a - v2.b;
        v2.product = v2.a * v2.b;
        v2.quotient = v2.a / v2.b;
        v2.remainder = v2.a % v2.b;
        System.out.println("sum = "+v2.sum);
        System.out.println("difference = "+v2.diff);
        System.out.println("product = "+v2.product);
        System.out.println("quotient = "+v2.quotient);
        System.out.println("remainder = "+v2.remainder);
    }
}
