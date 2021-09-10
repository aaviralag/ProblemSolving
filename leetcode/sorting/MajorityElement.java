class Solution {
    public int majorityElement(int[] nums) {
       int counter1=0, max=0, value=0;
        
        if(nums.length==1)
            return(nums[0]);
        
        for(int i=0; i<nums.length; i++)
        {
            counter1=1;
            
            for(int j=i+1; j< nums.length; j++)
            {
                if(nums[i]==nums[j]){
                     counter1++;
                }
                }
                if(max<counter1){
                     max=counter1;
                    value=nums[i];
                }}
                    
        return(value);
    }}
