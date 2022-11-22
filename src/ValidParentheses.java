import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("[]"));
    }

    public static boolean isValid(String s) {
        //Checking if input is not empty, null or starting from closing bracket.
        //All of those cases would mean input string is invalid.
        if (s == null || s.isEmpty() || s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                default:
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
