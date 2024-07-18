//Java Program to count the total number of duplicate elements in an array.

public class java50 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,10,20,30,40};
        int count=0;

        int brr[]=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;


                }


            }

           
        }
        System.out.println("The duplicate element count is  : "+count);

      
       
    }
    
}
