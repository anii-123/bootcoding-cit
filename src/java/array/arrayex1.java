package array;

public class arrayex1 {
    public static void main(String[] args) {

        //declare array
        int[] temp;

        //declare + initialize
        int[] arr = {5,9,15,2,8};

        //length of array
        int n = arr.length;

        //traverse array
        for(int i = 0; i<n; i++){
            if(arr[i] %2==0) {
            System.out.print(arr[i]+",");}
        }
    }
}
