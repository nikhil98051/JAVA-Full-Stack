// write a program to divide an integer by 0, try to catch the error and add a finally block in it.
public class try2{
    public static void main(String [] args){
        int a,b,result;
        a=89;
        b=0;
        try{
             result=a/b;
             System.out.println("the result is "+ result);
        }
        catch (ArithmeticException e) {
         System.out.println ("Can't be divided by Zero " + e);
      }
      finally{
        System.out.println("Finally Done");
      }
        
    }
}