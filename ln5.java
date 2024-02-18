public class ln5 {
  public static void main(String args[]){
    Sample o1 = new Sample();
    Sample o2 = new Sample();
    o1.setNum(10);
    o2.setNum(20);


    int result = o2.res(o2);
    System.out.println(result);
  }
}

class Sample{
  int num;

  void setNum(int n){
      num = n;
  }

  int res(Sample obj){
    int add = 0;
    add = num + obj.num;
    return add;
  }
}
