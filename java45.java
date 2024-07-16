//Java Program to insert an element at a given location in an array.
import java.util.*;

public class java45 {
    public static void main(String[] args) {
        try{
        
        
        Scanner scan = new Scanner(System.in);

        
    
    int arr[]={10,20,30,40,50,60,70,80,90};
    System.out.println("Enter your target value!");
    int targetvalue=scan.nextInt();
    System.out.println(" Enter your target index 0 to 8 ");
    int targetindex=scan.nextInt();
    int brr[]=new int [arr.length+1];
for(int i=0;i<targetindex;i++){
    brr[i]=arr[i];
}
    for(int i=targetindex;i<brr.length-1;i++){
        brr[i+1]=arr[i];
        brr[targetindex]=targetvalue;
    }
    
    for(int i=0;i<brr.length;i++){
        System.out.print(brr[i]+" ");

    }
}catch(Exception e){
    System.out.println("ENTERED WRONG INPUT!-->RE-ENTER!");

}
}
    
}
