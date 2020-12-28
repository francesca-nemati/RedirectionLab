import java.util.*;
public class PigLatin {
  public static void main(String[] args) {
    System.out.println(PigLatinSimple("mock"));
    System.out.println(PigLatinSimple("pie"));
    System.out.println(PigLatinSimple("david"));
    System.out.println(PigLatinSimple("aaron"));

    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));

    System.out.println(pigLatinBest("*emu"));
    System.out.println(pigLatinBest("4chan"));
    System.out.println(pigLatinBest("fish!"));
    System.out.println(pigLatinBest("fish"));
    System.out.println(pigLatinBest("the."));
    System.out.println(pigLatinBest("cat!"));
    System.out.println(pigLatinBest("amazing?"));
    System.out.println(pigLatinBest("apple%"));
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

  public static String pigLatin(String s) {
    s = s.toLowerCase();
    if (s.substring(0,2).equals("bl") || s.substring(0,2).equals("br") || s.substring(0,2).equals("ch") ||
    s.substring(0,2).equals("ck") || s.substring(0,2).equals("cl") || s.substring(0,2).equals("cr") ||
    s.substring(0,2).equals("dr") || s.substring(0,2).equals("fl") || s.substring(0,2).equals("fr") ||
    s.substring(0,2).equals("gh") || s.substring(0,2).equals("gl") || s.substring(0,2).equals("gr") ||
    s.substring(0,2).equals("ng") || s.substring(0,2).equals("ph") || s.substring(0,2).equals("pl") ||
    s.substring(0,2).equals("pr") || s.substring(0,2).equals("qu") || s.substring(0,2).equals("sc") ||
    s.substring(0,2).equals("sh") || s.substring(0,2).equals("sk") || s.substring(0,2).equals("sl") ||
    s.substring(0,2).equals("sm") || s.substring(0,2).equals("sn") || s.substring(0,2).equals("sp") ||
    s.substring(0,2).equals("st") || s.substring(0,2).equals("sw") || s.substring(0,2).equals("th") ||
    s.substring(0,2).equals("tw") || s.substring(0,2).equals("wh") || s.substring(0,2).equals("wr")) {
      String f = s.substring(0,2);
      s = s.substring(2) + f + "ay";
      return s;
    }
    else return PigLatinSimple(s);
  }

  public static String pigLatinBest (String s) {
    int ascii1 = (int) s.charAt(0);
    int asciiLast = (int) s.charAt(s.length()-1);
    if (ascii1 < 65 || ascii1 > 122) {
      return s;
    }
    else if (ascii1 < 97 && ascii1 > 90) {
      return s;
    }
    else if ((asciiLast >= 65 && asciiLast <= 90) || (asciiLast >= 97 && asciiLast <= 122) || (asciiLast >= 48 && asciiLast <= 57)) {
      return pigLatin(s);
    }
    else {
      String punctuation = s.substring(s.length()-1,s.length());
      s = s.substring(0,s.length()-1);
      s = pigLatin(s);
      s = s + punctuation;
      return s;
    }
  }

}
