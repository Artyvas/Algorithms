import java.util.HashMap;
import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) {

    lengthOfLongestSubstring("abcabcbb");
  }

  public static int lengthOfLongestSubstring(String s) {
    if (s.equals("")) {
      // System.out.println("Null String!");
      return 0;
    }
    String[] subArray = s.split("");
    // ArrayList<String> maxList = new ArrayList<String>();
    int maxLen = 0;
    ArrayList<String> subString = new ArrayList<String>();
    HashMap<String, Integer> hashIndex = new HashMap<String, Integer>();
    for (int i = 0; i < subArray.length; i++) {
      try {
        if (hashIndex.containsKey(subArray[i])) {
          System.out.println(i);
          if (i >= subArray.length - 2) {
            break;
          }
          i = hashIndex.get(subArray[i + 1]);
          // This solution breaks once there are two of the same character next to each
          // other at the end of the string.
          hashIndex.clear();
          subString.clear();
          hashIndex.put(subArray[i], i);
          subString.add(subArray[i]);
        } else {
          hashIndex.put(subArray[i], i);
          subString.add(subArray[i]);
          if (subString.size() > maxLen) {
            maxLen = subString.size();
          }
        }
      } catch (Exception e) {
        // hashIndex.put(subArray[i], i);
        // subString.add(subArray[i]);
        // System.out.println(subArray);
        // if (subString.size() > maxLen) {
        // maxLen = subString.size();
        // }
      }
    }
    System.out.println(maxLen);
    return maxLen;
  }
}
