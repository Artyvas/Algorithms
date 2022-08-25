import java.util.HashSet;

public class Optimized_Solution {
  public static void main(String[] args) {
    lengthOfLongestSubstring("abcabcbb");
  }

  public static int lengthOfLongestSubstring(String s) {
    HashSet<Character> refSet = new HashSet<Character>();
    int leftPoint = 0;
    int rightPoint = 0;
    int max = 0;

    while (rightPoint < s.length()) {
      char temp = s.charAt(rightPoint);
      if (!refSet.contains(temp)) {
        refSet.add(temp);
        rightPoint++;
        max = Math.max(max, refSet.size());
      } else {
        refSet.remove(s.charAt(leftPoint));
        leftPoint++;
      }
    }
    return max;
  }
}
