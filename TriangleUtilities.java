

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
      String a = "";
      for (int i = 1; i <= numberOfStars; i++) {
        a += "*";
      }
        return a;
    }

    public static String getTriangle(int numberOfRows) {
      String b = "";
      for (int i = 1; i <= numberOfRows; i++) {
        b += getRow(i) + "\n";
      }
        return b;
    }


    public static String getSmallTriangle() {
      String b = "";
      for (int i = 1; i <= 4; i++) {
        b += getRow(i) + "\n";
      }
        return b;
    }

    public static String getLargeTriangle() {
      String c = "";
      for (int i = 1; i <= 9; i++) {
        c += getRow(i) + "\n";
      }
        return c;
    }
  }
