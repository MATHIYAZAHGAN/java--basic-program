//Java Program to find the largest and smallest number in an array.

public class java60 {
    public static void main(String[] args) {
        int arr[]={20,30,40,1511,60,7,80,90,8954848,};
        int large=0;
        int small=0;
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    if(large<temp){
                        large=temp;
                    }
                }else if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    small=temp;
                }


            }
        }
        System.out.println("THE LARGEST NUMBER IS "+large);
        System.out.println("THE SMALLEST NUMBER IS "+small);

    }
    
}
