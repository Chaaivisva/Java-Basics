import java.util.*;
import java.lang.*;
public class e1{
  public static void main(String args[]){
      try{
        int age = 15;
        if(age<18){
            throw new myException("Hii Everyone");
        }
      }
      catch(myException e){
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
      }
  }
}

class myException extends Exception{
  myException(String s){
    super(s);
  }
}

