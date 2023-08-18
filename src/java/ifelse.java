import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n = sc.nextInt();
        System.out.println("enter second number");
        int m = sc.nextInt();

        if(n==m) {
            System.out.println("numbers are same");
        }
        else{
            System.out.println("numbers are different");
        }
    }
}
