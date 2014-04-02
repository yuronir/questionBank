package questionBank;

public class Main {
	public static void main(){
		String s = "";
		System.out.println(reverseWords(s));
		
		s = "a";
		System.out.println(reverseWords(s));
		
		s = "a b c";
		System.out.println(reverseWords(s));
	}
	
    public static String reverseWords(String s) {
        if(s.isEmpty()){
        	return "";
        }
    	
    	String[] ss = s.split(" ");
        StringBuilder reverseS = new StringBuilder();
		for (int i = ss.length; i > 0; i--) {
			reverseS.append(ss[i-1]);
			if (i != 0 && !ss[i-2].isEmpty()) {
				reverseS.append(" ");			}
		}
		return reverseS.toString();
    }
}