//Print 1 to 16 multiplication table

public class java26 {
    public static void main(String[] args) {
        for(int i=1;i<=16;i++){
            System.out.println();
            System.out.println("********************");
            System.out.println("*****"+i+" table*****");
            System.out.println("********************");

            for(int j=1;j<=16;j++){
                System.out.println("-------------------");
            System.out.println(" | "+j+" * "+i+" = "+i*j+"  | ");
            }


        }
    }
    
}
