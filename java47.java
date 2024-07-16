//Java Program to delete an element at first in an array.

public class java47 {
    public static void main(String[] args) {
        
    
    int arr[]={10,20,30,40,50,60,70,80,90};
    int brr[]=new int [arr.length-1];
    for(int i=0;i<arr.length-1;i++){
brr[i]=arr[i+1];
    }
    for(int i=0;i<brr.length;i++){
        System.out.print(brr[i]+" ");
    }

}

    
}
