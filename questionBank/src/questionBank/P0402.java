package questionBank;

public class P0402 {
	public static void main(){
		String s = "";
		System.out.println(reverseWords(s));
		
		s = "a";
		System.out.println(reverseWords(s));
		
		s = "a b c";
		System.out.println(reverseWords(s));
	}
	
    public static String reverseWords(String s) {
    	String[] ss = s.split(" ");
        StringBuilder reverseS = new StringBuilder();
		for (int i = ss.length; i > 0; i--) {
			reverseS.append(ss[i-1]);
			if (i != 1 && !ss[i-2].isEmpty()) {
				reverseS.append(" ");			
			}
		}
		return reverseS.toString();
    }
}
