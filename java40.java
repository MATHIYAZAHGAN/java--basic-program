//Java Program to print minimum and maximum element in an array.

public class java40 {
    public static void main(String[] args) {
        int arr[]={54,86,555,455,55,5,6,95};
        int max=0;
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(min>arr[i]){
                min =arr[i];
            }
        }
        System.out.println("The maximum value number is : "+max);
        System.out.println("The minimum value number is : "+min);
        
    }
    
}
