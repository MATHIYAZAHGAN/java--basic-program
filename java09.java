//Find vowels count from given string
public class java09{
    public static void main(String[] args) {
        String s="aeINDIAii";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='A'|| ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                count++;

            }
        }
        System.out.println("The vowel count is "+count);

    }
}

