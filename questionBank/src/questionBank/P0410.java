package questionBank;

/*
 * http://oj.leetcode.com/problems/reverse-integer/
 * Reverse Integer(123->321, -123 -> -321)
 */
public class P0410 {
	public static void main(String[] args){
		P0410 a = new P0410();
		System.out.println(a.reverse(175284));
	}
	
    public int reverse(int x) {

    	int sign = 1;
    	if(x < 0) sign = -1;
    	
    	String temp = Math.abs(x) + "";
        char[] ttemp = new char[temp.length()];
        
        for(int i = 0; i < temp.length(); i++){
        	ttemp[i] = temp.charAt(temp.length()-i-1);
        }

    	return sign * Integer.parseInt(String.valueOf(ttemp));
    }
}
