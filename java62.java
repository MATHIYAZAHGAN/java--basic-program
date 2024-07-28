//Java Program to find the top two maximum numbers in an array.
public class java62 {
    public static void main (String args[]){
        int arr[]={10,20,30,40,50};
        int large=0;
        int seclarge=0;
        int temp=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>large){
                temp=arr[i];
                arr[i]=large;
                large=temp;
                seclarge=arr[i];
            }
        }
        System.out.println("THE LARGEST NUMBER IS "+large);
        System.out.println("THE SECOND-LARGEST NUMBER IS "+seclarge);

    }
    
}
