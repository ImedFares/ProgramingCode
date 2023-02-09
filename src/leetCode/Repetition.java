package leetCode;

public class Repetition {
	  public int[] findErrorNums(int[] nums) {
	        int dup = -1, missing = -1;
	        for (int i = 1; i <= nums.length; i++) {
	            int count = 0;
	            for (int j = 0; j < nums.length; j++) {
	                if (nums[j] == i)
	                    count++;
	            }
	            if (count == 2)
	                dup = i;
	            else if (count == 0)
	                missing = i;
	        }
	        int[] arr = new int[] {dup, missing};
	        for (int i : arr) {
				System.out.println(i);
			}
			return arr;
	         
	    }
	    
	    public static void main(String[] args) {
	    	Repetition r = new Repetition();
	    	int[] nums = new int[2];
	    	nums[0]=1;
	    	nums[1]=1;
	    	r.findErrorNums(nums);
		}

}
