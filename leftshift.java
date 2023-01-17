public class leftshift{
    public static void main(String []args){
        int [] a=new int[]{1,2,3,4,5};
        int n=4;
        // we have to left shift by 3 position o/p is 4,5,1,2,3
        for(int i=0;i<n;i++){
            int x=a[0];
            int j;
            for(j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[j]=x;
        }
        System.out.println("array after left rotation is:");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
}