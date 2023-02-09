package leetCode.longestplandrome;
class Solution {
    public String longestPalindrome(String s) {
        String longestPlandrome="";
        for (int i = 0 ; i <s.length() ; i++){
            String palindromeSt="";
            boolean isPlandrome=false;
            for( int j=0 ; j <s.length() ; j++){
                palindromeSt+=s.charAt(j);
                 isPlandrome = reverseStr(palindromeSt);
                 if(isPlandrome && palindromeSt.length() > longestPlandrome.length())
                 longestPlandrome = palindromeSt;
            }

        }
        return longestPlandrome;
    }

    private boolean reverseStr(String st){
        String reversedSt="";
        for (int i = st.length()-1 ;i>=0; i--){
            reversedSt= reversedSt + st.charAt(i);
        }
        if(reversedSt.equals(st)) return true;
        return false;
    }
    
    public static void main(String[] args) {
		Solution s =  new Solution();
		
		System.out.println(s.longestPalindrome("a"));
	}
}