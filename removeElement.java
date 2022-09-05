package removeElement;

public class solution {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
    int target = 2;
    removeElement(nums, target);
  }

  public static int removeElement(int[] nums, int val) {
    int y = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        nums[i] = 0;
      } else {
        int temp = nums[i];
        nums[i] = 0;
        nums[y] = temp;
        y++;
      }
    }
    return y;
  }
}
