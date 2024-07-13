//Reversing the order of words in a sentence

import java.util.*;

class java30{
    public static void main(String[] args) {
        String s=" my name is mathiyazahgan";
        String revsentence=reverse( s);
        System.out.println(revsentence);
        
    }
    public static String reverse(String s){
        String word[]=s.split(" ");
        String result ="";
        for(int i=word.length-1;i>0;i--){
            if(i==0){

            }else{
                result=result+word[i]+" ";
            }
        }
        return result;



    }
}
