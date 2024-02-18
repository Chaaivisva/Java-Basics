public class ln8 {
  public static void main(String args[]){
    Sample obj1 = new Sample("name", 10);
    Sample obj2 = new Sample(obj1);
    obj2.print(); 
  }
}

class Sample{
  String name;
  int age;
  Sample(String name, int age){
      this.name = name;
      this.age = age;
  }

  Sample(Sample obj){
    this.name = obj.name;
    this.age = obj.age;
  }

  void print(){
    System.out.println(name);  
    System.out.println(age);  
  }
}
