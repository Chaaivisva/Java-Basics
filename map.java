import java.util.*;

public class map {
  public static void main(String args[]){
        int i = 1;
        Map<Integer, String> map = new HashMap<Integer, String>();
        while(i != 0){
          Scanner up = new Scanner(System.in);
          System.out.println("\n 1. Enter the Student detail \n 2. Search the Student detail \n 3. Exit");
          System.out.println("Enter your Choice : ");
          int choice  = up.nextInt();
          switch (choice) {
            case 1:
              Scanner in = new Scanner(System.in);
              System.out.println("Enter the Student Id : ");
              int id = in.nextInt();
              System.out.println("Enter the Student Name : ");
              String name = in.next();

              map.put(id, name);
              break;
            case 2:
              Scanner out = new Scanner(System.in);
              System.out.println("Enter the student id : ");
              int j = out.nextInt();
              for(Map.Entry m: map.entrySet()){
                if(m.getKey().equals(j)){
                  System.out.println("Found");
                }
                else{
                  System.out.println("Not Found");
                }
              }
              break;
            case 3:
              System.exit(0);
            default:
              break;
          }
        }
  }
}
