import java.util.Scanner;

public class Forevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number=");
        int n = sc.nextInt();
        System.out.println("even numbers");
        for( int i =1; i<= n; i++ ){
            if(i % 2 == 0){
                System.out.println(i +" ");
            }
        }
        System.out.println("\n odd numbers");
        for( int i =1; i<= n; i++ ){
            if(i % 2 !=0){
                System.out.println(i +" ");
            }
        }

    }
}
