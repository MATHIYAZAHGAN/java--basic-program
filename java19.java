//Find Armstrong number

import java.util.Scanner;

public class java19{

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scan = new Scanner(System.in);
        int arr = scan.nextInt();

        int brr=arr;
        int arm=0;

            while(arr != 0){
           int sum=arr % 10;
           arm=arm+sum*sum*sum;
           arr=arr/10;
       

            }
        
            if(Integer.compare(brr, arm)==0){
                System.out.println("It is a armstrong number");
            }else{
                System.out.println("Its not a arm Strong number");
            }
          


         
        


        }
        
        

        
    }
    

