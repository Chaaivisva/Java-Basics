import java.util.*;

class in{
    int romanto(String s){
      int n = s.length();
      int total=0;
      for(int i=0; i<n;i++){
          if(s.charAt(i) == 'C'){
            if(i<n-1 && s.charAt(i+1) == 'M'){
              total += 900;
            }
            else if(i<n-1 && s.charAt(i+1) == 'D'){
              total += 400;
            }
            else{
            total += 100;
            }
          }

          else if(s.charAt(1) == 'X'){
            if(i<n-1 && s.charAt(i+1) == 'C'){
                total += 90;
            }
            else if(i<n-1 && s.charAt(i+1) == 'L'){
                total += 40;
            }
            else{
            total += 10;
            }
          }

          else if(s.charAt(i) == 'I'){
            if(i<n-1 && s.charAt(i+1) == 'X'){
              total += 9;
            }
            else if(i<n-1 && s.charAt(i+1) == 'V'){
              total += 4;
            }
            else{
            total += 1;
            }
          }

          else if(s.charAt(i) == 'V'){
            total += 5;
          }
          else if(s.charAt(i) == 'L'){
            total += 50;
          }
          else if(s.charAt(i) == 'D'){
            total += 500;
          }
          else if(s.charAt(i) == 'M'){
            total += 1000;
          }
      }
      return total;
    }
}


class itegertoroman{
  public static void main(String[] args){
      String s = "MMI";
      in a = new in();
      System.out.println(a.romanto(s));
  }
}