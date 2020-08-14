public class everyNth {
  public String everyNth(String str, int n) {
    String substr = "";
    for (int i = 0; i < str.length(); i++) {
      if (i % n == 0) {
        substr += str.charAt(i);
      }
    }
    return substr;
  }

}
