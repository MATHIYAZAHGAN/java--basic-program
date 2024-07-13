//Finding the square root of a number

class java28{
    public static void main(String[] args) {
        double num=54;
        double i=1;
        while(i<num/2){
            if(num/i==i){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
