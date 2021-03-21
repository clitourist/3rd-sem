import java.util.Scanner;

public class Arr_sum {
    public static void main(String[] args) {
        variables v4 = new variables();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            v4.sum2 = v4.sum2 + arr[i];
        }
        System.out.println("Sum of array is : " + v4.sum2);
    }
}
