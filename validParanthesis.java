import java.util.ArrayList;

public class validPara {
  public static void main(String[] args) {
    isValid("()[]{}");
  }

  public static boolean isValid(String s) {
    // implement stack to store the string - I'm choosing to use ArrayList for my
    // stack
    ArrayList<Character> linter = new ArrayList<Character>();
    for (int i = 0; i < s.length(); i++) {
      char temp = s.charAt(i);
      // If it's an opening brace, push it onto the stack
      if (temp == '(' || temp == '{' || temp == '[') {
        linter.add(temp);
      } else if (temp == ')' || temp == '}' || temp == ']') {
        char tempTwo = linter.remove(linter.size() - 1);
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
    if (!linter.isEmpty()) {
      System.out.println("Missing closing brace");
      return false;
    }
    System.out.println("code is valid");
    return true;
  }
}
