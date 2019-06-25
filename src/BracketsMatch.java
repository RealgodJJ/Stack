import java.util.Stack;

public class BracketsMatch {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);
            if (alphabet == '(' || alphabet == '[' || alphabet == '{')
                stack.push(alphabet);
            else {
                if (stack.isEmpty())
                    return false;

                if (alphabet == ')' && stack.pop() != '(')
                    return false;

                if (alphabet == ']' && stack.pop() != '[')
                    return false;

                if (alphabet == '}' && stack.pop() != '{')
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
