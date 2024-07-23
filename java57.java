//Java Program to perform one left rotation on an array.

public class java57 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int r =3;
        // rev(arr);
        for (int j = 0; j<r;j++){


        int index = arr[0];
        for(int i = 1 ; i< arr.length ; i++){
            arr[i-1] = arr[i];
        }
    
    
        arr[arr.length-1]= index;
    }
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    

    }
    // public static void rev(int arr[]) {
    //     int temp=0;
    //     int a = arr[0];
    //     int b=arr[arr.length-1];
    //     int temp = a;
    //     int a = b;
    //     int b = temp;
    // }
    
}
