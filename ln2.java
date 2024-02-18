import java.util.*;
class person{
  String name;
  int age;
  person(String name, int age){
    this.name = name;
    this.age = age;
  }

  void printPerson(){
    System.out.println(name+" "+age);
  }
}


class ln2 {
  public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your Name : ");
      String name = in.nextLine();
      System.out.println("Enter your Age : ");
      int age = in.nextInt();
      person obj = new person(name, age);
      obj.printPerson();
  }
}
