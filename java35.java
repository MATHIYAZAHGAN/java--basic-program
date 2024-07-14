//Java Program to count total number of even and odd elements in an array.

public class java35 {
    public static void main(String[] args) {
    int arr[]={45,61,84,86,15,975,9452};
    int oddcount=0;
    int evencount=0;
    for(int i =0;i<arr.length;i++){
        if(arr[i]%2==0){
            evencount++;
        }else{
            oddcount++;
        }

    }
    System.out.println("The total number of even number count is : "+evencount);
    System.out.println("The total number of odd number count is : "+oddcount);

        
    }
    
}
