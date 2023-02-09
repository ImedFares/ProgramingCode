package leetCode.sumtriples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<Integer> numbers = null;
        ArrayList<List<Integer>> numbersList = new ArrayList<List<Integer>>();
        for (int i=0; i<nums.length;i++){
        	
           for (int j=i+1; j<nums.length;j++){
        	   
             for (int k=j+1; k<nums.length;k++){
            	 numbers=new ArrayList<Integer>();
               if(nums[i]+nums[j]+nums[k] ==0){
            	   numbers.add(nums[i]);
                   numbers.add(nums[j]);
                   numbers.add(nums[k]);
                   Collections.sort(numbers);
                   if(!numbersList.contains(numbers))
                	   numbersList.add(numbers);
               }
               
             }

           } 
           
        }
        return numbersList;
    }
    
    public  List<List<Integer>> threeSumss(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }

        } 
        return new ArrayList<>(res);

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public  List<List<Integer>> threeSumCC(int[] nums) {
    	Set<List<Integer>> finalList  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(finalList);
        Arrays.sort(nums);
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
		     int k =nums.length-1;
		    for (int j = i+1; j< nums.length-1; j++) {
		    	numsSum = nums[i]+nums[j]+nums[k];
				if(numsSum == 0) {
					int[] numsLocal = new int[] {nums[i],nums[j],nums[k]};
					Arrays.sort(numsLocal);
					List<Integer> list = IntStream.of(numsLocal).boxed().toList();
	                   if(!finalList.contains(list))
	                	   finalList.add(list);
				}
				else if (numsSum>0) {
					k--;
					j--;
				}
			}
		}
        return new ArrayList<>(finalList);

    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums= {-1,0,1,2,-1};
		System.out.println(s.threeSumCC(nums));
	}
}
