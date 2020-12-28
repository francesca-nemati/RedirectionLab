import java.util.*;
public class MakeStars {
  public static void main(String[] args) {
    Scanner n = new Scanner( System.in );
    while (n.hasNextLine()) {
      Scanner w = new Scanner(n.nextLine());
      while (w.hasNext()) {
        String c = w.next();
        for (int i = 0; i < c.length(); i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
