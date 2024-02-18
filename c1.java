import java.util.HashSet;

public class c1 {
  public static void main(String args[]){
      HashSet <details> store = new HashSet<details>();

      store.add(new details("Chocolate", 10, "10/12/24", 5));
      store.add(new details("Candy", 5, "23/4/24",2));
      store.add(new details("Milk", 20, "18/5/24", 6));
      store.add(new details("Nike", 4, "19/5/24", 5));

      for(details d:store){
          d.availability();
      }

      for(details d:store){
          if(d.qty<=5){
              d.Min();
          }
      }
  }
}

class details{
  String name;
  int qty;
  String date;
  int mrp;
  details(String name, int qty, String date, int mrp){
    this.name = name;
    this.qty = qty;
    this.date = date;
    this.mrp = mrp;
  }
  void availability(){
    System.out.println("Name"+" "+name+" "+"Quantity"+" "+qty+" "+"Date"+" "+ date+" "+"Mrp"+" "+mrp);
  }
  void Min(){
    System.out.println("");
    System.out.println("Name"+" "+name+" "+"Quantity"+" "+qty+" "+"Date"+" "+ date+" "+"Mrp"+" "+mrp);
  }
}
