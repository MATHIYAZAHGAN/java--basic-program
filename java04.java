//Find given character characters occurrence count from given String

public class java04 {
    public static void main (String args[]){
        char s1 ='d';
    int count =0;
    String s ="dada";

    for(int i=0;i<s.length();i++){
       char ch =s.charAt(i);
       if(ch==s1){
        count++;
       }

    }
    System.out.println("The character ocurrence in the string is "+count);

}
}
