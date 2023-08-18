import java.util.Scanner;

public class InputEx {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = sc.nextInt();
        System.out.println("Enter the second num2ber");
        int m = sc.nextInt();
        int add = n + m;
        System.out.println("Addition" + add );
        int sub = n - m;
        System.out.println(sub);
       int mul = n * m;
       System.out.println(mul);
        int div = n/m;
        System.out.println(div);




    }
}
