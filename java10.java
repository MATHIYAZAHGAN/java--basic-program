//Print in ascending order of the given string array
public class java10{
    public static void main (String args[]){
        String s="apple";
        char ch[]=s.toCharArray();
        int n=ch.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(ch[j]>ch[j+1]){
                    char temp =ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;

                }
            }
        }
        String output=new String(ch);
        System.out.println(output);
    }
}
