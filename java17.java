//Print distinct values from number array
class java17{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,40,60,70,10};
        for(int i=0;i<arr.length;i++){
            boolean unique = true;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                     unique=false;

                }
             
            }
            if(unique){
                System.out.print(arr[i]+" ");

            }
          
        }

    }
}
