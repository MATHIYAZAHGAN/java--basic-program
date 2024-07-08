public class java18{
    public static void main (String args[]){
        String s="mathiyazahgan";
        int count[]= new int [256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;

        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]>1){
                System.out.print(s.charAt(i)+" ");
                count[s.charAt(i)]=0;
            }
        }

    }
}