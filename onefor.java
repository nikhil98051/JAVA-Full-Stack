/*
1 
2 2
3 3 3 
4 4 4 4 
print using 1 for loop*/
public class onefor{
    public static void main(String []args){
        int n=4;
        
        for(int i=1;i<=n;i++ ){
            double k=Math.pow(10,i);
            double r=i*(k-1);
            double j = r/9;
            System.out.println(j);
        }
    }
}
  