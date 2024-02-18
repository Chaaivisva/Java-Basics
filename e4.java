import java.io.*;
import java.util.*;
public class e4 {
  public static void main(String args[]){

      try{
        File fw = new File("C:\\Users\\Chaai visva R\\Desktop\\hii.txt");
        FileOutputStream fout = new FileOutputStream(fw);
        String s = "Hi";
        byte b[] = s.getBytes();
        fout.write(b);
        fout.close();


        FileInputStream fin = new FileInputStream(fw);
        int i=0;
        int count = 0;
        while((i=fin.read()) != -1){
             count++;
        }
        if(count<=0){
          throw new myexception("It doesn't contain anything!");
        }else{
          System.out.println("It contains");
        }
        fin.close();
      }
      catch(IOException e){
          System.out.println(e.getMessage());
      }
      catch(myexception e){
        System.out.println(e.getMessage());
  }
}
}
class myexception extends Exception{
  myexception(String s){
    super(s);
  }
}
