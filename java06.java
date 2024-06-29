// Swap integer variable values without using a third variable
public class java06{
    public static void main(String args[]){
        int a=10;
        int b=15;
        
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value is "+a+": b value is "+b);
    }
}