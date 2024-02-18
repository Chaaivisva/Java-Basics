public class untitled {
  public static void main(String args[]){
      String s1 = "Hii";
      String s2 = "Hello";

      System.out.println(s1.length());
      System.out.println(s1.concat(s2));
      System.out.println(s1.startsWith("H"));
      System.out.println(s2.endsWith("i"));
      System.out.println(s1.trim());
      System.out.println(s1.replace(s1, s2));
      System.out.println(s2.toUpperCase());
      System.out.println(s1.toLowerCase());
      System.out.println(s1.charAt(2));
  }
}