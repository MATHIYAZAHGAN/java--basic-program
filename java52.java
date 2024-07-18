//Java Program to merge two arrays into a third array.

public class java52 {
    public static void main(String[] args) {
        
    
    int arr[]= {10,20,30,40,50,60,70,80,90};
    int brr[]={100,200};
    int crr[]=new int[arr.length+brr.length];
    for(int i=0;i<arr.length;i++){
            crr[i]=arr[i];


        
    }
    for(int i=0;i<brr.length;i++){
        crr[arr.length+i]=brr[i];

    }
    System.out.println("The Merged Array is : ");
    for(int j=0;j<crr.length;j++){
System.out.print(+crr[j]+"  ");
    }
}
    
}

