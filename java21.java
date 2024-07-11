// find if there is any special characters in a string and remove it


public class java21 {
    public static void main(String[] args) {
        String s="lkmngkiin@(*$(oplmwk))";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '*' && ch !='.' && ch !='/' && ch != '#' && ch != '@' && ch != '$' && ch != '!'){
                System.out.print(ch);

            }

        }

        
    }
    
}
