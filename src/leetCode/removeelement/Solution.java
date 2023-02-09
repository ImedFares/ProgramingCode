package leetCode.removeelement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length >100 || val >100)
        return 0;
	/*
	 * List<Integer> arrayList = IntStream.of(nums) .boxed()
	 * .collect(Collectors.toList()); List<Integer> arrayListfiltred = new
	 * ArrayList<>(); //List<Integer> arrayListfiltred = arrayList.stream()
	 * //.filter(e->e.intValue() != val).collect(Collectors.toList());
	 * arrayList.forEach(x->{ if(x.intValue() != val) arrayListfiltred.add(x); });
	 * arrayListfiltred.forEach(s->System.out.println(s)); return
	 * arrayListfiltred.size();
	 */
        //int[] numsCC = new int[nums.length];
        int j=0;
        for (int i =0 ; i<nums.length;i++){
            if(nums[i] != val){
               //ÒnumsCC[j]=nums[i];
               j++;
            }
        }
        return j;

    }
    
    public static void main(String[] args) {
		Solution sl = new Solution();
		int[] nums = new int [] {3,2,2,3}; //0,1,2,2,3,0,4,2}
		int val = 3;
		System.out.println(sl.removeElement(nums, val));
	}
}