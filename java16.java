//Find sum of odd and even numbers separately for 1 to 10

public class java16 {
    public static void main(String[] args) {
        int n=10;
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evensum=evensum+i;

            }else{
                oddsum=oddsum+i;
            }

        }
        System.out.println("Evensum ="+evensum);
        System.out.println("Oddsum ="+oddsum);
    }
    
    
}
