import java.lang.reflect.Method;
import java.lang.Integer;
public class ln3{
  public static void main(String args[]) throws ClassNotFoundException{
    Class c1 = Class.forName("java.lang.Integer");

      Method m[] = c1.getMethods();
      System.out.println(c1.getPackage());
      for(Method method:m){
          System.out.println(method);
      }
      // System.out.println(c1.getClassLoader());
  }
}
