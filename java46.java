//Java Program to delete an element at the end of an array.

public class java46 {
    public static void main(String[] args) {
        
    
    int arr[]={10,20,30,40,50,60,70,80};
    int brr[]=new int [arr.length-1];
    for(int i=0;i<arr.length-1;i++){
        brr[i]=arr[i];
System.out.print(brr[i]+" ");
    }
}
}
