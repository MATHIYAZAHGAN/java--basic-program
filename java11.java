public class java11 {
    //Insert the new element into the array at the designated position
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int brr[]=new int[arr.length+1];
        int n=0;
        int value=51;
    
        for(int i=n;i<arr.length;i++){
            arr[n]=value;


        }
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
            System.out.print(brr[i]+" ");
        }
    }
    
}
