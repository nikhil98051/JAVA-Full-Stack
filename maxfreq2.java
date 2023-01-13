//nums[]={4,5,9,12,9,22,45,7} write a java program to print the number with the maximum frequencyfrom the array.
class maxfreq2{
    public static void main(String []args){
        int nums[]={4,5,9,12,9,22,45,7};
        int n=nums.length;
        //get max frequency
        int maxfreq=0;
          int ans=-1;
        for(int i=0;i<n;i++){
            int curEle=nums[i];
            int freq=0;
           
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j])
                {
                    freq++;
                }
            }
            if(freq>maxfreq){
                maxfreq=freq;
                
        }
        if(freq==maxfreq){
             ans=curEle;

        }
          // System.out.println(maxfreq);//2
           
        }
         System.out.println(ans);
    }
}  
        




    
