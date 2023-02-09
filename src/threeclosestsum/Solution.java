package threeclosestsum;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length<3)return 0;
        
        Arrays.sort(nums);

        int closest = Integer.MAX_VALUE;
       int i=0;
       int j=1;
       int k=2;
       //boolean end = false;
       while(nums.length>i ){
    	   int sum = nums[i]+nums[j]+nums[k];
    	   if(sum - target == 0)
    		   return  nums[i]+nums[j]+nums[k];
           if (Math.abs(target - sum) < Math.abs(target - closest))
           {
        	   closest = sum;
           }
       if(k<nums.length-1)
    	   k++;
       else if(k==nums.length-1 && j<nums.length-2) {
    	   j++;
    	   k=j+1;
       }
       else if(j==nums.length-2 && nums.length>3 && k==nums.length-1) {
    	   i++;
    	   j=i+1;
    	   k=j+1;
    	   if(k>nums.length-1) break;
    	  // end = true;
    	   
       }
       if(nums.length==3) {
    	   break;
       }
       
       
    }
       return closest;
       
}
    public static void main(String[] args) {
		Solution cl = new Solution();
		int[] nums= new int[]{0,3,97,102,200} ;// {0,0,0}; // {-1,2,1,-4}; Ò
		int target = 300;
		System.out.println(cl.threeSumClosest(nums, target));
	}
}