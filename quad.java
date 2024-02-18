import java.util.*;
public class quad {
   public static void main(String args[]){
        Scanner up = new Scanner(System.in);
        System.out.println("Enter the A : ");
        int a = up.nextInt();
        System.out.println("Enter the B : ");
        int b = up.nextInt();
        System.out.println("Enter the C : ");
        int c = up.nextInt();

        int d = ((b*b) - (4*a*c));

        if(d>0){
          double r1 = (-b + Math.sqrt(d)) / (2 * a);
          double r2 = (-b - Math.sqrt(d))/(2*a);

          System.out.println("Root 1 : "+ r1 +" "+ "Root 2 :"+ r2);
        }
        else if(d==0){
          double r1 = -b/(2*a);
          double r2 = -b/(2*a);
          System.out.println("Root 1 : "+ r1 +" "+ "Root 2 :"+ r2);
        }
        else{
          double r1 = -b/(2*a);
          double r2 = Math.sqrt(d)/(2*a);
          System.out.println("Root 1 : "+ r1+r2+"i" +" "+ "Root 2 :"+ r1+r2+"i");
        }
   }
}
