import java.util.Stack;

public class validPara {
  public static void main(String[] args) {
    isValid("]");
  }

  public static boolean isValid(String s) {
    // implement stack to store the string - I'm choosing to use ArrayList for my
    // stack
    Stack<Character> linter = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      char temp = s.charAt(i);
      // If it's an opening brace, push it onto the stack
      if (temp == '(' || temp == '{' || temp == '[') {
        linter.push(temp);
      } else if (temp == ')' || temp == '}' || temp == ']') {
        if (linter.empty()) {
          System.out.println("Missing opening brace");
          return false;
        }
        char tempTwo = linter.pop();
        if ((temp == ')' && tempTwo != '(') || (temp == '}' && tempTwo != '{') || (temp == ']' && tempTwo != '[')) {
          System.out.println("Brace mismatch");
          return false;
        }
      }
      // Once you encounter a closing brace - you pop from the top of the stack, if
      // it's empty (returns null) then there is no opening brace
      // If the popped element matches the closing brace - then it's valid, otherwise
      // thrwo error
      // If stack is not empty by the end of the loop, then we are missing a closing
      // brace - check type and return the type of brace that we are missing
    }
    if (!linter.empty()) {
      System.out.println("Missing closing brace");
      return false;
    }
    System.out.println("code is valid");
    return true;
  }
}
