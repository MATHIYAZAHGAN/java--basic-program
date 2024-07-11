// Find the Largest Number in an Array

public class java22{
    public static void main(String[] args) {
        int arr[]={10,20,3054,595,58452,68468684};
        int brr=arr[0];
        for(int i=0;i<arr.length;i++){
            if(brr<arr[i]){
                brr=arr[i];
            }
        }
        System.out.println(brr);
    }
}
