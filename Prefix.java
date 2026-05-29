public class Prefix {
  public static void main(String[] args) {
    String strs[] = { "flower", "flow", "flight" };
    int x = strs[0].length();

    for (int j = 1; j < strs.length; j++) {
      int y = strs[j].length();

      if (strs[j].length() > x) {
        y = x;
      }

      for (int i = 0; i < y; i++) {

        if (strs[0].charAt(i) != strs[j].charAt(i)) {
          x--;
        }
      }

    }
    System.out.println(strs[0].substring(0, x));
  }
}
