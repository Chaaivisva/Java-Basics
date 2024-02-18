import java.util.*;


public class MatrixAddition {
  public static void main(String args[]){
    Scanner up = new Scanner(System.in);

    System.out.println("Enter the number of elements : ");
    int n = up.nextInt();

    int a[][] = new int[n][n];
    int b[][] = new int[n][n];
    int c[][] = new int[n][n];

    System.out.println("Enter the A Matrix elements : ");
    for(int i=0;i<n;i++){
      for(int j=0; j<n;j++){
        System.out.print(i +" "+ j +"=");
        a[i][j] = up.nextInt();
      }
    }

    System.out.println("Enter the B Matrix elements : ");
    for(int i=0;i<n;i++){
      for(int j=0; j<n;j++){
        System.out.print(i +" "+ j +"=");
        b[i][j] = up.nextInt();
      }
    }

    for(int i=0;i<n;i++){
      for(int j=0; j<n;j++){
        c[i][j] = a[i][j] + b[i][j];
      }
    }

    System.out.println("Addtion Matrix:");
    for(int i=0;i<n;i++){
      for(int j=0; j<n;j++){
        System.out.print(c[i][j]+ " ");
      }
    System.out.println();
    }
}
}
