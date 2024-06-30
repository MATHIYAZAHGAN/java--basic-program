// Find given string is anagram or not

import java.util.*;

public class java08{

   public static boolean isanagram(String s,String s1){
        if(s.length()!=s1.length()){
            return false;
        }

        int arr[]=new int [256];
        int brr[]= new int [256];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<s1.length();i++){
            brr[s1.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        
    
        String s ="keep";
        String s1 ="peek";
        if(isanagram(s, s1)){
            System.out.println("It is anagram");
        }else{
            System.out.println("It's not a anagram");
        }
       
    }
}