//Write a Java program to convert an integer value to an absolute value.
import java.util.*;


public class java24 {
    public static void main (String args[]){
        int  number=-565150;
        int  absolutevalue =absolutenum(number);
        System.out.println("The absoulute value is " + absolutevalue );

    }
    public static int absolutenum(int number){
if(number<0){
    return -number;
}else{
    return number;
}

    }
    
}
