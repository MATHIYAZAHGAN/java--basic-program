//Java Program to sort array elements in descending order.

public class java56 {
public static void main(String[] args) {
    int arr[]={10,50,5,412,2,45,515};
    int temp;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.print(arr[i]+"  ");
    }

    
}
    
}
