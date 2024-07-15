//Java Program to copy one array to another array.

public class java42 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int brr[]=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
        for(int i=0;i<brr.length;i++){
            System.out.println("The copy array value is  "+i+ " : " +brr[i]);
        }
        
    }
    
}
