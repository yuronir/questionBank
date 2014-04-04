package questionBank;

import java.util.Stack;

//http://oj.leetcode.com/problems/evaluate-reverse-polish-notation/
//���������� ���
//�ùٸ� ��������ĸ� �Էµȴٰ� ����.
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
    
    //�ش� String�� �������� �Ǻ�
    public boolean isInteger(String s){
    	try{
    		Integer.parseInt(s);
    	} catch(NumberFormatException e){
    		return false;
    	}
    	return true;
    }
    
//  �ٸ� ���   
//    public boolean isInteger(String s){
//    	Scanner sc = new Scanner(s.trim());
//    	if(!sc.hasNextInt()){
//    		return false;
//    	}
//    	return true;
//    }
    
    //������ �Ǻ�
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
