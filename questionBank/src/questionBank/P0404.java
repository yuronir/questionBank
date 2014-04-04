package questionBank;

import java.util.Stack;

//http://oj.leetcode.com/problems/evaluate-reverse-polish-notation/
//후위연산자 계산
//올바른 후위연산식만 입력된다고 가정.
public class P0404 {

    public int evalRPN(String[] tokens) {
    	int result = 0;
    	int a;
    	int b;
    	Stack s = new Stack();
    	
    	if(tokens.length == 1) {
    		return Integer.parseInt(tokens[0]);
    	}
    	
    	for(int i = 0; i < tokens.length; i++){
    		if(isInteger(tokens[i])){
    			s.push(Integer.parseInt(tokens[i]));
    		} else {
    			b = (Integer) s.pop();
    			a = (Integer) s.pop();
    			if(i+1 == tokens.length){
    				result = operation(tokens[i], a, b);
    			} else {
    				s.push(operation(tokens[i], a, b));
    			}
    		}
    	}
    	
    	return result;
    }
    
    //해당 String이 정수인지 판별
    public boolean isInteger(String s){
    	try{
    		Integer.parseInt(s);
    	} catch(NumberFormatException e){
    		return false;
    	}
    	return true;
    }
    
//  다른 방법   
//    public boolean isInteger(String s){
//    	Scanner sc = new Scanner(s.trim());
//    	if(!sc.hasNextInt()){
//    		return false;
//    	}
//    	return true;
//    }
    
    //연산자 판별
    public int operation(String operator, int a, int b){
    	
    	int result = 0;
    	
    	if(operator.equals("+")){
    		result = a+b;
    	} else if(operator.equals("-")){
    		result = a-b;
    	} else if(operator.equals("*")){
    		result = a*b;
    	} else if(operator.equals("/")){
    		result = a/b;
    	} else {
    		System.out.println("operation failed!");
    	}
    	
    	return result;
    }
}
