class student1 {
  String dept;
  int year;
  String name;
  String roll_no;
  boolean isHostal;
  int no_of_days;

  void info(String dept, int year, String name, String roll_no, boolean isHostal, int no_of_days){
      this.dept = dept;
      this.year = year;
      this.name = name;
      this.roll_no = roll_no;
      this.isHostal = isHostal;
      this.no_of_days = no_of_days;
      System.out.println(dept);
  }
  
  void display(){
        System.out.println("Department : "+dept+"\n"+"Year : "+year+"\n"+"Name : "+name+"\n" + "Roll Number : "+ roll_no+ "\n"+ "Hostal"+isHostal+"\n" + "Number of days : "+ no_of_days);
  }
}

class advisor extends student1{
  advisor(){
      super.display();
    }      
}

class mess extends student1{
  mess(){
    if(isHostal == true){
      int bill = no_of_days * 150;
      System.out.println("Bill : "+ bill);
    }
  }
}

class student{
  public static void main(String args[]){
      String dept = "CSE";
      int year = 2022;
      String name = "Chaai";
      String roll_no = "22BCS018";
      boolean isHostal = true;
      int no_of_days = 45;

      student1 n = new student1();
      n.info(dept, year, name, roll_no, isHostal, no_of_days);
      n.display();

      
      System.out.println("Mess Bill : ");
      mess n2 = new mess();
  }
}
