//Java Program to check whether two arrays are equal in size or not.

public class java59 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int brr[]={10,20,30,40,50,70,75};
        int b =arr.length;
        int c =brr.length;
        if(b == c){
            System.out.println(" Both array is equal");
        }else{
            System.out.println(" Both array is not equal");


        }
        System.out.println("arr contains "+b+ " elements");
        System.out.println("brr contains "+c+ " elements");


      
    }
    
}
