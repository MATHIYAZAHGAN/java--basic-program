//Find given String is a palindrome

public class java05{
    public static void main (String args[]){
        String s ="Mam";
        String word="";
        for(int i=0;i<s.length();i++){
             char ch =s.charAt(i);
             word =ch+word;
        }
        if(s.equalsIgnoreCase(word)){
            System.out.println("its palindrome");

        }else {
            System.out.println("It's not a palindrome");
        }

    }
}