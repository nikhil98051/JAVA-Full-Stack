class q5{
    public static void main(String[] args){
      
       	int flag=0;
	String s="ABCDCBA";
	int n=s.length();
	for(int i=0;i<n/2;i++)
	{
		if(s.charAt(i) == s.charAt(n-i-1))
		{
			flag=1;
			break;
	    }
		
	}
	if(flag==1)
	{
       System.out.println("palindrome");
			
    }
	else
	{
		System.out.println(" not palindrome");
				
	}
	
    }
}