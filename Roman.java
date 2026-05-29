import java.util.HashMap;
import java.util.Map;

public class Roman {
  public static void main(String[] args) {
    String input = "XXXIV";
    int output = 0;
    Map<Character, Integer> nums = new HashMap<>();
    nums.put('I', 1);
    nums.put('V', 5);
    nums.put('X', 10);
    nums.put('L', 50);
    nums.put('C', 100);
    nums.put('D', 500);
    nums.put('M', 1000);

    for (int i = 0; i < input.length() - 1; i++) {

      if (nums.get(input.charAt(i)) < nums.get(input.charAt(i + 1))) {
        output = output + nums.get(input.charAt(i + 1)) - nums.get(input.charAt(i));
      } else {
        output = output + nums.get(input.charAt(i));
      }

    }

    System.out.println(output);

  }
}
