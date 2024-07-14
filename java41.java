//Java Program to print second largest element in an array.

public class java41 {
    public static void main(String[] args) {
        int max=0;
        int seclarge=0;
        int temp=0;
        int arr[]= {45,865,147,5257,477,581,89};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                temp=arr[i];
                arr[i]=max;
                max=temp;
                seclarge=arr[i];
                
                
            }

            }
        
        System.out.println("The second largest value is : "+seclarge);
        
    }
    
}
