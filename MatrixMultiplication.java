import java.util.*;

public class MatrixMultiplication{
public static void main(String args[]){

Scanner up = new Scanner(System.in);
int a[][]=new int[3][3];  
int b[][]=new int[3][3];  
  
  
int c[][]=new int[3][3]; 
System.out.print("Enter A Matrix");
for(int i=0;i<3;i++){
  for(int j=0;j<3;j++){
    System.out.print(i+" "+j+":");
    a[i][j] = up.nextInt();
  }
}
System.out.print("Enter B Matrix");
for(int i=0;i<3;i++){
  for(int j=0;j<3;j++){
    System.out.print(i+" "+j+":");
    b[i][j] = up.nextInt();
  }
}

for(int i=0;i<3;i++){  
for(int j=0;j<3;j++){  
c[i][j]=0;    
for(int k=0;k<3;k++)    
{    
c[i][j]+=a[i][k]*b[k][j];                                            
}
System.out.print(c[i][j]+" ");
}
System.out.println();  
}  
}}