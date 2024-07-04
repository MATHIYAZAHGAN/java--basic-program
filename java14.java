// Find Prime number from 0 to 50
public class java14{
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;



    }
    public static void primenumber(int limit){
        for(int i=2;i<=limit;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        int limit =50;
        primenumber(limit);
        
    }
}
