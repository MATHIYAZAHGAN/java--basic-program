//For the given string find the sum of index

import java.util.*;
class java32{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println();
        System.out.println("Enter your String!!");
        String s = scan.nextLine();

        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sum = sum+i;
            

        }
        System.out.println();
        System.out.println("***output***");
        System.out.println("The sum of index value is "+sum);
    }
    }
}
