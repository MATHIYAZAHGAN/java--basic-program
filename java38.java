//Java Program to find reverse of an array.

public class java38 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int brr[]= new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            brr[i]=arr[i];
            System.out.print(brr[i]+"  ");

        }
        
    }
    
}
