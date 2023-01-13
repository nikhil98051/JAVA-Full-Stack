//write a java program to print the length of  same consecutive numbers in an array
class array1{
    public static void main(String[] args){
        int nums[]={1,1,2,2,3,3,3,1,1,4,4};
        int n=nums.length;
        int len=1;
        int curnum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==curnum){
                len++;
            }
            else{
                curnum=nums[i];
                System.out.println(len);
                len=1;
            }

        }
          System.out.println(len);
    }
}