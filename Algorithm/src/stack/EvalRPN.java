package stack;

import java.util.Stack;

public class EvalRPN {

	public static void main(String[] args) {
		String[] s = {"3","-4","+"};
		System.out.println(evalRPN(s));
	}
    public static int evalRPN(String[] tokens) {
    	
    	int l = tokens.length ,ans = 0;
    	Stack<Integer> s = new Stack<Integer>();
    	for(int i=0; i<l ; i++) {
    		if(tokens[i].equals("+")||tokens[i].equals("-")
    				||tokens[i].equals("*")||tokens[i].equals("/")){
    			ans = get(tokens[i], s.pop(), s.pop());
    			s.push(ans);
    		} else {
    			s.push(Integer.parseInt(tokens[i]));
    		}
    	}
		return s.pop();
    }
    public static int get(String op,int a,int b){
        int result=0;
        switch(op){
            case "+":
                result=a+b;
                break;
            case "-":
                result=b-a;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                if(a==0)
                    return 0;
                else
                    result=b/a;
                break;
        }
        return result;
    }

}
