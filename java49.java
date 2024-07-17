//Java Program to print all unique elements in the array.

public class java49 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,10,20,50};
        int brr[]= new int [arr.length];
        
    for(int i=0;i<arr.length;i++){
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i] == arr[j]){
                count++;
                brr[j]=-1;

            }
           
        }
        if(brr[i] != -1){
            brr[i]=count;
        }





    }
    for(int i=0;i<arr.length;i++){
        if(brr[i]==1){
            System.out.print(arr[i]+"  ");
        }
    }

        
    }
    
    
}
