//Java Program to insert an element at end of an array.
import java.util.*;

public class java43 {
    public static void main(String[] args){
        
        while(true){
            try{
            System.out.println();
        System.out.println("Enter your array end value !");
        Scanner scan = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int brr[]  = new int [arr.length+1];
        int target = scan.nextInt();
        for(int i=0;i<brr.length-1;i++){

            brr[i]=arr[i];
            brr[i+1]=target;
        }
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    
}catch(Exception e){
    System.out.println("Enter valid input!");

}
    
}
}
}
