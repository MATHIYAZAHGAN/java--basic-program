class java12{
    static int n1=0,n2=1,n3=0;
    public static void main(String args[]){
int n=10;
System.out.print(n1+" ");
System.out.print(n2+" ");
fibinocii(n-2);
    }
    public static void fibinocii(int n){
        if(n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            fibinocii(n-1);
        }
    }
}