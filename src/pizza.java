import java.util.Scanner;

public class pizza {
    public static void main(String args[]){
        System.out.println("Name : VEDAV.K.S");
        System.out.println("USN : 1DS19CS187");
        System.out.println("Section : D");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Enter your amount : ");
        int a = sc.nextInt();
        int d=0;
        int length = name.length();
        int sum [] = new int[length];
        for(int i=0;i<length;i++){
            char ch = name.charAt(i);
            sum[i] =((int) ch - 64);
            //System.out.println(sum[i]);
            d = d+ sum[i];
        }
        int r=d%10;

        double discount = 0;
        if(r==5)
            discount = a/2;
        else if(r==3)
            discount = a -(0.3*a);
        else if(r==2)
            discount = a-(0.2*a);
        else
            discount = a;
        System.out.println("Amount after discount is :" +discount);
    }
}
