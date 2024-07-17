//Java Program to count and print the frequency of each element in an array.
class java48java{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,10,20,30};
        int brr[]=new int [arr.length];
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
            if (brr[i]>0) {
                System.out.println(arr[i]+" ouccures "+brr[i]+"  times ");

                
            }
            
        }
    }
}
