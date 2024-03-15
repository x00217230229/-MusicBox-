import java.util.Stack;

public class BalancedParentheses{

    Stack<Charaacter> stack = new Stack<>();
    private boolean isBalanced;

    public  void balancedParentheses(String expression) {
        for(char bracket: expression.toCharArray()) {
            if(bracket == '{' || bracket =='(' || bracket == '['){
                stack.push(bracket);

            }else if(bracket == '}' || bracket ==')' || bracket == ']'){
                if(stack.isEmpty() || isItBalanced(stack.pop(), bracket)){
                    System.out.println("The expression is not balanced");
                    return;

                }

            }   
        }
        System.out.println("The experssion is balanced");       
    }

    private boolean isItBalanced(Charaacter pop, char bracket) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isItBalanced'");
    }

    public boolean BalancedParentheses(char open, char close){

        //boolean isBalanced = false;
        if(open == '{' && close == '}'){
            return true;
        }else if(open == '(' || close == ')'){
            return true;
        }else if(open == '[' || close == ']'){
            return true;
        }
        return isBalanced;
    }
    
}