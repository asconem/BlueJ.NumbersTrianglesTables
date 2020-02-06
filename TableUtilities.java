

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      String a = "";
      for (int row = 1; row <= 5; row++) {
        for (int col = 1; col <= 5; col++) {
          if (col*row < 10) {
            a += "  " + col*row + " |";
          }
          else {
            a += " " + col*row + " |";
          }
        }
        a += "\n";
      }
    return a;
}
    public static String getLargeMultiplicationTable() {
      String a = "";
      for (int row = 1; row <= 10; row++) {
        for (int col = 1; col <= 10; col++) {
          if (col*row < 10) {
            a += "  " + col*row + " |";
          }
          else if ((col*row >= 10) && (col*row < 100)){
            a += " " + col*row + " |";
          }
          else {
            a += col*row + " |";
          }
        }
        a += "\n";
      }
    return a;
    }

    public static String getMultiplicationTable(int tableSize) {
      String a = "";
      for (int row = 1; row <= tableSize; row++) {
        for (int col = 1; col <= tableSize; col++) {
          if (col*row < 10) {
            a += "  " + col*row + " |";
          }
          else if ((col*row >= 10) && (col*row < 100)){
            a += " " + col*row + " |";
          }
          else {
            a += col*row + " |";
          }
        }
        a += "\n";
      }
    return a;
    }
}
