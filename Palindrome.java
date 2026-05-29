public class Palindrome {
  public static void main(String[] args) {
    Integer x = 121;
    String y = x.toString();

    StringBuilder compare = new StringBuilder();

    for (int i = y.length() - 1; i >= 0; i--) {
      compare.append(y.charAt(i));
    }

    if (compare.toString().equals(y)) {
      System.out.println("True");

    } else {
      System.out.println("False");

    }

  }
}
