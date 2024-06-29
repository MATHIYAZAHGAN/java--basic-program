// Reverse String without using inbuilt method

public class java02 {
    public static void main (String args[]){
        String s="helloworld";
        String revword ="";
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            revword =ch+revword;
            

            

        }
        System.out.println ("reversed String = "+revword);

    }
    
}
