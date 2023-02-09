package shuffle.array;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arryLn = nums.length;
        int[] res = new int[arryLn];
       if(arryLn <2 || arryLn%2 !=0) 
           return null;
        else{
        	Collections.shuffle(Arrays.asList(nums));
        }
       System.out.println("res = "+nums);
       return res;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,2,3,4,4,3,2,1};  //[1,4,2,3,3,2,4,1]   [1, 4, 2, 3, 4, 2, 3, 1]
	    int n = 4;
		s.shuffle(nums, n);
	}
}