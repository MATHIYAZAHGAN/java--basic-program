//Java Program to sort array elements in ascending order.

public class java55 {
    public static void main(String[] args) {
        int arr[]={20,60,540,80,6414,651,4,454};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }

            }
            System.out.print(arr[i]+" ");

        }
    }
    
}
