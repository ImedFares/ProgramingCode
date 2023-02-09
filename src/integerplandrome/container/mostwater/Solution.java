package integerplandrome.container.mostwater;

class Solution {
	/**
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int max = 0;
		int vol = 0;
		int h = 0;
		int j = height.length-1;
		for (int i = 0; i < height.length; i++) {
				if (height[i] > height[j]) {
					h = height[j];
					j--;
					i--;
				}
				else {
					h = height[i];
					
				}
					

				vol = h * (j-i);
				if (max < vol) {
					max = vol;
				}
                
			
		}
		return max;
	}
	
	public int maxAreaMap(int[] height) {
		  int maxarea = 0;
	        int left = 0; 
	        int right = height.length - 1;
	        while (left < right) {
	            int width = right - left;
	            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
	            if (height[left] <= height[right]) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        return maxarea;
		      
		    
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] ar = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(s.maxArea(ar));
	}
	
	
	
	private int returnMaxLeft(int[] height) {
		int max = 0;
		for (int i = height.length-1 ; i>height.length/2 ; i--) {
			if(max<height[i]) {
				max = height[i];
			}

		}
		return max;
	}
	
	private int returnMaxRight(int[] height) {
		int max = 0;
		for (int i = 0 ; i<height.length/2 ; i++) {
			if(max<height[i]) {
				max = height[i];
			}

		}
		return max;
	}
}