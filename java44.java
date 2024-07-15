//Java Program to insert an element at the beginning of an array.

import java.util.Scanner;

public class java44 {
    public static void main(String[] args) {
        while(true){
            try{
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your array first value !");
        int arr[]={10,20,30,40,50,60,70,80,90};
        int brr[]= new int [arr.length+1];
        int target= scan.nextInt();
        for(int i=0;i<brr.length-1;i++){
            brr[0]=target;
            brr[i+1]=arr[i];


        }
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }catch(Exception e){
        System.out.println("ENTERED WRONG VALUE -->RE-ENTER");

    }
        
    }
    
}
}
