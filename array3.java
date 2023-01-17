class array3{
   public static void min(int a[]){
        int i;
        int min1=a[0];
        for(i=1;i<a.length;i++){
            if(a[i]<min1){
                min1=a[i];
            }
        }
        System.out.println("min element in an array is " + min1);
    }
      public static void max(int a[]){
        int i;
        int max1=a[0];
        for(i=1;i<a.length;i++){
            if(a[i]>max1){
                max1=a[i];
            }
        }
        System.out.println("max element in an array is " + max1);
    }
    public static void sum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("sum of the element of the array is :" + sum);
    }
    public static void main(String []args){
        int a[]={1,2,3,4,5};
       
        min(a);
        max(a);
        sum(a);
    }
}