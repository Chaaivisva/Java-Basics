public class ln4 {
  public static void main(String args[]){
      Sample[] arrobj = new Sample[3];
      arrobj[0] = new Sample();
      arrobj[1] = new Sample();
      arrobj[2] = new Sample();

      arrobj[0].print();
      arrobj[1].print();
      arrobj[2].print();
  }
}

class Sample{
  void print(){
    System.out.println("Hello world");
  }
}
