import java.util.Scanner;

public class QuadraticEquation {
    int a, b, c;
    double r1, r2, d;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the values of a,b & c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    void discriminant() {
        d = (b * b) - 4 * a * c;
    }

    void calculateRoots() {
        if (d > 0) {
            System.out.println("Roots are Distant");
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are " + r1 + " & " + r2);
        } else if (d == 0) {
            System.out.println("Roots are Equal");
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = r1;
            System.out.println("Roots are " + r1 + " & " + r2);
        } else {
            System.out.print("Roots are Imaginary\nNo Real Solutions");
        }
    }
}

class QERun {
    public static void main(String[] args) {
        System.out.println("Name : Vedansh\nUSN :1DS19CS186");
        QuadraticEquation qe = new QuadraticEquation();
        qe.input();
        qe.discriminant();
        qe.calculateRoots();
    }
}