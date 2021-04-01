package basic;

import java.util.Stack;

public class Test3 {
    public static void main(String[] args) {
        //System.out.println(balancedParenthensies("{[()]}"));
        System.out.println(balancedParenthensies("{}[()]"));
        System.out.println(balancedParenthensies("[{]}"));
        System.out.println(balancedParenthensies("]()["));
    }

    public static boolean balancedParenthensies(String expression) {
        if ((expression.length() % 2) == 1) return false;

        Stack<Character> stack = new Stack<Character>();

        for (char ch : expression.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }

            //starting only closed bracket then directly return false
            if (stack.isEmpty()) return false;

            if (ch == '}' && stack.pop() != '{'
                    || ch == ']' && stack.pop() != '['
                    || ch == ')' && stack.pop() != '(') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
