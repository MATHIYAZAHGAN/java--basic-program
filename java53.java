//Java Program to separate even and an odd numbers of an array in two separate arrays.


public class java53 {
    public static void main(String[] args) {
        int arr[]={10,25,30,75,50,68,67,92};
        int odd[]=new int [arr.length];
        int even[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[i]=arr[i];
            }else{
                odd[i]=arr[i];
            }
        }
        System.out.println("odd numbers in the array :");

for(int i=0;i<arr.length;i++){
    if(odd[i]!= 0){
        System.out.print(odd[i]+"  ");
    }
  

}
System.out.println();

System.out.println("even numbers in the array :");
for(int i=0;i<arr.length;i++){
    if(even[i]!= 0){
        System.out.print(even[i]+"  ");
    }
  

}

        
    }
    
}
