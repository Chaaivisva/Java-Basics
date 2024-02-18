import java.util.*;

public class factorial {
  public static void main(String args[]){
      int fact=1, i;
      Scanner up = new Scanner(System.in);
      int num = up.nextInt();

      for(i=1; i<=num;i++){
          fact = fact*i;
      }
      System.out.println(fact);
  }
}
