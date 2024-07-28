//Java Program to find the second highest number in an array.

class java61{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int large =0;
        int seclarge=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                temp=arr[i];
                arr[i]=large;
                large=temp;
                seclarge =arr[i];
            }
        }
        System.out.println("second higheset number in array "+seclarge);
    }
}