import java.util.*;
;
public class Main {
    static boolean areBracketsBalanced(String expr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push((int) x);
            } else if (x == ')' || x == ']' || x == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                int check = stack.pop();
                if ((x == ')' && check != '(') || (x == ']' && check != '[') || (x == '}' && check != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression:");
        String expr = sc.nextLine();
        if (areBracketsBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}