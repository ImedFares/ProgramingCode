package math.pow;
class Solution {
    public static double myPow(double x, int n) {
    	if (n == 0) return 1;
        if (x == 1) return 1;
    	int k=0;
        double res=0;
        if(n <0)
            k = Math.abs(n);
        else
            k=n;
        for (int i=0; i<k-1;i++){
        	if(res == 0)
        		res = x*x;
        	else
        		res=res*x;
            
            }
        if(n<0){
            res = 1/res;
        }
        return res;
    }
    
    public static void main(String[] args) {
		double x= 34.00515;
		int n = -3;
		System.out.println(myPow(x, n)); //3e-05
	}
}