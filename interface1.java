interface abc{
    void name();// by default function is abstract so we dont declare any function in interface

}
class interface1 implements abc{
    public void name(){
        System.out.println("My name is Nikhil");
    }
    public static void main(String args[]){
        interface1 in=new interface1();
        in.name();
    }
}