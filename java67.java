//	Two numbers are entered through the keyboard.
// Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
import java.util.*;
public class java67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER ");
        int a = scan.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b = scan.nextInt(); 
        int c=1; 
        for(int i=0;i<b;i++){
                c=c*a;


            }


        
        System.out.println(c);

        
    }
}
