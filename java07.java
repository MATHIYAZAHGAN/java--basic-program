// Find biggest word from the string
public class java07{
public static void main (String args[]){
    String s="my name is mathiyazahgan";
    String word ="";
    String biggest="";
    s=s+" ";
    for (int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        if(ch!=' '){
            word =word+ch;
        }else {
            if(biggest.length()<word.length()){
                biggest=word;
            }
            word="";


        

    }
}
    System.out.println("The biggest word is "+ biggest);


}
}