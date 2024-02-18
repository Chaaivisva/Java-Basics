import java.util.*;

class list {
  public static void main(String[] args){
    int i=1;
    
    LinkedList <String> item = new LinkedList<String>();
    while(i!=0){
      System.out.println("\n 1. Enter the item \n 2. Peek the item \n 3. Remove the item \n 4. Exit \n 5. Display All the Items. ");
      System.out.println("Enter the Choice : ");
      
      Scanner up = new Scanner(System.in);
      int choice = up.nextInt();
      switch (choice) {
        case 1:
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the item name: ");
          String item_name = in.nextLine();
          item.add(item_name);
          break;
        case 2:
          System.out.println(item.peek());
          break;
        case 3:
          System.out.println("Enter the remove item : ");
          System.out.println(item.poll());
          break;
        case 5:
          Iterator <String> itr = item.iterator();
          while(itr.hasNext()){
            System.out.println(itr.next());
          }
          System.out.println(item.size());
          break;
        case 4:
          System.exit(0);
        default:
          break;
      }
    }
  }
}
