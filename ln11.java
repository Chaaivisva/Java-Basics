import java.lang.reflect.Method;
public class ln11 {
  public static void main(String args[]) throws ClassNotFoundException{
    Class < ? extends Object> obj = new Object() {}.getClass();
    Class o1 = Class.forName("ln11");
    System.out.println(o1.getClassLoader());
    Method m[] = obj.getMethods();
    for(Method method:m){
        System.out.println(method);
    }
    boolean res = obj.isAnonymousClass();
    if(res){
        System.out.println("It is Anonymous Class");
    }
    else{
      System.out.println("It is not the Anonymous Class");
    }
  }
}
