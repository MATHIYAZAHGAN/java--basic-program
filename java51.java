//Java Program to delete all duplicate elements from an array.


public class java51 {
    public static void main(String[] args) {
        
    
    int arr[]={10,20,30,40,10,20,30,501};
    int brr[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                arr[i]=0;
                arr[j]=0;
                
            }
        }

    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            System.out.println(arr[i]);
        }


    }
}
    
}