//Java Program to take input and print elements of array.
import java.util.*;

public class java33 {
    public static void main(String[] args) {
        int arr[]= new int[5];
        while(true){
            System.out.println();
        System.out.println("Enter your value !");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();

        }
    
        for(int i=0;i<arr.length;i++){
            System.out.print("The output is "+i+": " +arr[i]+"  ");
        }
    }
    }
    
}
