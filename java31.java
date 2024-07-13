// Find Leap year
import java.util.*;

public class java31 {
    public static void main(String[] args)throws Exception {
        int i=0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("******************");
            System.out.println("please enter year!");
            System.out.println("******************");

         i = scan.nextInt();
            if(i%4==0 ){
                System.out.println("oh !This is leap year "+i+"  ");

            }else{
                System.out.println("oh ! This is not leap year ");
            }


        }
            
        }
        
    }

    
        
    
    

