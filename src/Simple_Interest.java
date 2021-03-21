import java.util.Scanner;

public class Simple_Interest {
    public static void main(String []args){
        variables v1 = new variables();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal, rate and time :");
        v1.p = sc.nextInt();
        v1.i = sc.nextInt();
        v1.t = sc.nextInt();
        v1.amount  = ((v1.p * v1.i * v1.t)/100)+ v1.p;
        System.out.println("The amount is : "+v1.amount);
    }
}
