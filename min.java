public class min {
  public static void main(String args[]){
      int arr[] = {1,20,30,40,23};
      int arra = arr[0];
      for(int array:arr){
          if(arra > array){
              arra = array;
          }
      }
      System.out.println(arra);
  }

}
