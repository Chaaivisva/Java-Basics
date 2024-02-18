import java.util.*;
public class e3{
  public static void main(String args[]){
    int arr[] = {1,1,2,3,4,5,5};

    HashMap <Integer, Integer> map = new HashMap<>();

    for(int num:arr){
        if(map.containsKey(num)){
            map.put(num, map.get(num)+1);
        }
        else{
          map.put(num,1);
        }
    }

    for (Integer key : map.keySet()) {
      if (map.get(key) > 1) {
          System.out.println("Duplicate number: " + key);
      }
  }

  }
}