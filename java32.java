// For the given string find the sum of index
class java32{
    public static void main(String[] args) {
        String s ="mathiyazahgan";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sum = sum+i;
            

        }
        System.out.println(sum);
    }
}
