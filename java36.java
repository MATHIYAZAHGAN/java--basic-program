//Java Program to count total number of negative elements in an array.

public class java36 {
    public static void main(String[] args) {
        
    
    int arr[]={-45,52,91,78,94,-841,5458,-894};
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            count++;
        }

    }
    System.out.println("The Nagative Number count is : "+count);
}
}
