//Java Program to search an element in an array.

public class java54 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int key=60;
        System.out.println(key+"  is found at index : "+ linearsearch(arr, key));
        
    }

    public  static int linearsearch(int ar[],int key){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==key){
            return i;
            }

        }
        return -1;


    }
    
}
