//Reverse the given number
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class java20 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scan = new Scanner(System.in);
        int arr=scan.nextInt();
        int rev=0;

    
    while(arr != 0){
        int reverse=0;

    int sum=0;
    sum=arr%10;


    reverse=sum+reverse;
    arr=arr/10;
     rev=reverse;
     System.out.print(rev);



    }
    System.out.print("  reverse number");



   
}
    
}
