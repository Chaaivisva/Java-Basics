import java.util.*;

class Mactching{
  void pattern(int num){
    int i=1;
    while(i<=num){
      int j=1;
      if(i==2||i==3){
        i++;
        continue;
      }
      else{
        while(j<=i){
          if(j==1||j==i){
            System.out.print("1");
          }else{
            System.out.print("0");
          }
        
          j++;
        }
        System.out.println();
      }
      i++;
  }
}
}

public class patternMatching {
  public static void main(String[] args){
      Scanner n = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num = n.nextInt();

      Mactching a = new Mactching();
      a.pattern(num);
  }
}
