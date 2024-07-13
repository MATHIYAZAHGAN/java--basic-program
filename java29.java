//Reversing an array in place

public class java29 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int brr[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            brr[i]=arr[i];
            System.out.print(arr[i]+" ");

        }
    }
    
}
