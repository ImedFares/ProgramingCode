package integerplandrome;
class Solution {
    public boolean isPalindrome(int x) {
    	if(x<0) return false;
        StringBuilder builder  = new  StringBuilder();
        StringBuilder revBuilder= new  StringBuilder();
        builder.append(x);
        revBuilder.append(x);
        if(revBuilder.reverse().toString().equals(builder.toString())) return true;
        return false;
        
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPalindrome(101));
	}
}