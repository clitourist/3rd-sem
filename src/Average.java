import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        variables v3 = new variables();
        System.out.println("Enter the number of inputs");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            v3.sum1 = v3.sum1 + arr[i];
        }
        v3.average = v3.sum1 / n;
        System.out.println("Average is :" + v3.average);
    }
}
