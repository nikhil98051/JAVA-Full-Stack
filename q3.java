public class q3{
    public static void main(String []args){
        int a[]={1,2,3,4,5,0};
        int i;
        int even=0,odd=0,zeros=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2==0 && a[i]!=0)
            {
                even++;
            }
            if (a[i]%2!=0){
                odd++;
            }
            if(a[i]==0){
                zeros++;
            }
        }
        System.out.println("no of even numbers in an array is :"+ even);
        System.out.println("no of odd numbers in an array is :"+ odd);
        System.out.println("no of zero's in an array is :"+ zeros);
    }
}