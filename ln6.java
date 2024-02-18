public class ln6 {
  public static void main(String args[]){
      Student obj = new Student("Chaai visva", 18, "22BCS018");
      obj.empdetails();
  }
}

class Person{
  String name;
  int age;
  String roll;
  Person(String name, int age, String roll){
    this.name = name;
    this.age = age;
    this.roll = roll;
  }
}

class Student{
  Person p;
  Student(String name, int age, String roll){
    p = new Person(name, age, roll);
  }

  void empdetails(){
    System.out.println("Name : " + p.name);
    System.out.println("Age  : " + p.age);
    System.out.println("roll : " + p.roll);
  }
}
