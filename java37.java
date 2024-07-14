//Java Program to print all negative elements in an array.

public class java37 {
    public static void main(String[] args) {
        int arr[]={-102,52,-89,45,841,-584};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+"   ");
            }
        }
    }
    
}
