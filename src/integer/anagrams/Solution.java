package integer.anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagramss(String s, String p) {
        int pLn = p.length();
        List<Integer> res = new ArrayList<Integer>();
        String subS = s.substring(0, ((pLn)>s.length()) ? s.length() :pLn );
        char arraySubS[] = subS.toCharArray();

        Arrays.sort(arraySubS);

        String orderedSubS= new String(arraySubS);

        char arrayP[] = p.toCharArray();

        Arrays.sort(arrayP);

        String orderedP= new String(arrayP);
        
        if(orderedP.equalsIgnoreCase(orderedSubS))
        	res.add(0);
        for (int i =pLn ; i <s.length() ; i++){
           
        	String subSFor = s.substring(i, ((pLn+i)>s.length()) ? s.length() :pLn+i );
        	System.out.println("subSFor = "+subSFor);
        	subS= subS + s.charAt(i);
        	subS = subS.substring(1);
        	System.out.println("subS = "+subS);
            char arraySubSFor[] = subS.toCharArray();

            Arrays.sort(arraySubSFor);

            String orderedSubSFor= new String(arraySubSFor);

            
            if(orderedP.equalsIgnoreCase(orderedSubSFor))
            	res.add(i);
           
       
            
        }
        System.out.println("res = "+res);
        return res;

    }


    public List<Integer> findAnagramsCC(String s, String p)
    {
    	List<Integer> res = new ArrayList<Integer>();
    	int n = s.length(), m = p.length();

    	char[] sortedpat = p.toCharArray();
    	Arrays.sort(sortedpat);

    	String temp;
    	for (int i = 0; i <= n - m; i++) {
    		temp = "";
    		for (int k = i; k < m+i ; k++)
    			temp += s.charAt(k);
    		char tempArray[] = temp.toCharArray();
    		Arrays.sort(tempArray);
    		temp = new String(tempArray);
    	

     		if (String.valueOf(sortedpat).equals(temp))
     			res.add(i);
    	}
    	return res;
    }

    public List<Integer> findAnagrams(String s, String p) {
		List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = p.length();
		if(m>n){
            return ans;
        }
		int []arrs = new int[26];
		int []arrp = new int[26];
		for(int i=0;i<m;i++){
			arrs[s.charAt(i)-'a']++;
			arrp[p.charAt(i)-'a']++;
		}
		for(int i=0;i<=n-m;i++){
		    if(iszero(arrs,arrp)){
                ans.add(i);
            }
			arrs[s.charAt(i)-'a']--;
			if(i+m < n){
                arrs[s.charAt(i+m)-'a']++;
            }
		}
		System.out.println("ans = "+ans);
		return ans;
	}
    public boolean iszero(int [] arrs, int []arrp){
        for(int j=0;j<26;j++){
			if(arrs[j]!=arrp[j]){
				return false;
			    }
			}
        return true;
    }


    public static void main(String[] args) {
		Solution sl = new Solution();
		//String s = "eklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjdwtcaxzsnifvhmoueklpyqrbgjd...";
		String s = "dcbkfgcbaknkbas";
		String p = "abk";
		//sl.findAnagrams(s, p);
		sl.findAnagrams(s, p);
	}
    
}