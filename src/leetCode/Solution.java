package leetCode;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int iem=0, jem=0;
       for  (int i=0;i<nums.length;i++){
           for  (int j=1;j<nums.length-1;j++){
           if(target == (nums[i]+nums[j])){
              iem= nums[i];
              jem=nums[j];
           }

       }
       } 
       //System.out.println("iem = "+iem +" jem ="+ jem);
       int[] arr = new int[]{iem,jem};
    return arr;
    }
    public static void main(String[] args) {
		Solution s =new Solution();
		int[] nums = new int[] {2,7,11,15};
		int target =9;
		s.twoSum(nums, target);
	}
}