import static java.lang.Math.*; 
class equation{
  void equationroot(int a, int b, int c){
    double d;
    d = b*b/(4*a*c);

    double sqrtval = sqrt(abs(d));

    if(d>0.0){
      System.out.println((double)(-b+(sqrtval)/(2*a)) +"\n"+ (double)(-b-(sqrtval)/(2*a)));
    }else if(d==0.0){
      System.out.println((double)(-b/(2*a)) +"\n" + (double)(b/(2*a)));
    }else{
      System.out.println(((double)(-b+(sqrtval)/(2*a))+"+i")+"\n"+((double)(-b+(sqrtval)/(2*a))+"-i"));
    }
  }
}


public class quadratic {
  public static void main(String args[]){
      equation n = new equation();
      int a=1, b=20, c=30;
      n.equationroot(a, b, c);
  }
}
