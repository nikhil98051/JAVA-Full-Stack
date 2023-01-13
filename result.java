interface A{
   public void mul(double x, double y);
    public void div(double x,double y);
}
interface B{
    public void add(double x, double y);
    public void sub(double x,double y);

}
interface C extends A,B{
  
     public void result1(double z);

}
public class result implements C{
    public void mul(double x, double y){
        double res=x*y;
         result1(res);
    }
     public void add(double x, double y){
        double res=x+y;
         result1(res);
    }
     public void sub(double x, double y){
        double res=x-y;
         result1(res);
    }
     public void div(double x, double y){
        double res=x/y;
        result1(res);
    }
     public void result1(double z){
       System.out.println(z);
    }
    public static void main(String []args){
        result r=new result();
        r.add(2,6);
        r.sub(2,6);
        r.div(2,6);
        r.mul(2,6);

    }
}