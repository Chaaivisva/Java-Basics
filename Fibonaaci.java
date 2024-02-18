import java.util.Scanner;

public class Fibonaaci {
  public static void main(String[] args){
  int a=-1, b=1, c=0, i;
  Scanner n = new Scanner(System.in);
  System.out.print("Enter the Number : ");
  int num = n.nextInt();
  for(i=0; i<num;i++){
      c=a+b;
      System.out.println(c);
      a=b;
      b=c;
    }
  }
}
