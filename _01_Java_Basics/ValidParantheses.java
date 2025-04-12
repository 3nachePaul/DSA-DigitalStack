package _01_Java_Basics;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:  s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char open = stack.pop();
                if (!((open == '(' && c == ')') ||
                      (open == '[' && c == ']') ||
                      (open == '{' && c == '}')))
                      return false;

            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s));
    }
}
