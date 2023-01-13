//java program to reverse an integer
//n = 12345
//rev_n = 54321

public class q2{
    public static void main(String []args){
        int reverse=0,number=5678;
        
        while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("reverse number is "+ reverse);

    }
}