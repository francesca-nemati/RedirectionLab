import java.util.*;
public class PigLatin {
  public static void main(String[] args) {
    System.out.println(PigLatinSimple("mock"));
    System.out.println(PigLatinSimple("pie"));
    System.out.println(PigLatinSimple("david"));
    System.out.println(PigLatinSimple("aaron"));
  }

  public static String PigLatinSimple(String s){
    s = s.toLowerCase();
    if (s.substring(0,1).equals("a") || s.substring(0,1).equals("e") || s.substring(0,1).equals("i") || s.substring(0,1).equals("o") || s.substring(0,1).equals("u")) {
      s = s + "hay";
    }
    else {
      String f = s.substring(0,1);
      String pig = s.substring(1) + f + "ay";
      s = pig;
    }
    return s;
  }

}
