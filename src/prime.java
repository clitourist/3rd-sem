import java.util.Scanner;

public class prime {
    public static void main(String []args){
        int user_age = 0,user_salary=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user age");
        user_age = sc.nextInt();
        System.out.println("Enter user salary");
        user_salary = sc.nextInt();
        System.out.println("User age is "+user_age+" and user salary is "+user_salary);
    }
}

