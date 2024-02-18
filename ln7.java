public class ln7 {
  public static void main(String args[]){
      Sample obj = new Sample(10,11,"Chaai");
      Sample obj1 = new Sample("Visva", 6.1f);
      Sample obj2 = new Sample();
  }
}

class Sample{
  Sample(){
    System.out.println("Hello World!");
  }

  Sample(int a, int b, String name){
    System.out.println((a+b) + " "+ name);
  }

  Sample(String name, float inch){
    System.out.println(name+ ' ' + inch);
  }

}