public class rotation{
    public static void main(String []args){
        int [] a =new int[]{1,2,3,4,5};
        int n=3;
        for(int i=0;i<n;i++){
            int j,x=a[a.length-1];
            for(j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=x;
        }
         System.out.println("array after right rotation is:");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
}