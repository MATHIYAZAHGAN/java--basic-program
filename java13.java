//Print a Fibonacci series without using recursion

public class java13 {
    static int n1=0,n2=1,n3=0;
    public static void main(String[] args) {
        int n=25;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        fibonacci(n-2);
        
    }
    public static int fibonacci(int n){

        for(int i=0;i<n;i++){

            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");


        }
        return n-1;

    }

    
}
