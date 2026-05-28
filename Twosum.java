public class Twosum {
  public static void main(String[] args) {
    int[] nums = { 3, 2, 4, 3 };
    int target = 6;

    boolean bool = false;
    int i = 0;

    while (bool == false && i < nums.length - 1) {

      for (int j = i + 1; j < nums.length; j++) {

        if (nums[i] + nums[j] == target) {
          System.out.println("(" + i + ", " + j + ")");
          bool = true;
          break;
        }

      }

      i++;

    }
  }
}
