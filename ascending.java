class Sort{
  void bubble(int arr[]){
    int n=arr.length;
    int i,j,temp;
    for(i=0;i<n-i;i++){
      for(j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
      }
    }
  }

  void display(int arr[]){
     for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+ " ");
     }
  }
}

public class ascending {
      public static void main(String[] args){
          int arr[] = {10,22,2,15,11,19};

          Sort n = new Sort();
          n.bubble(arr);

          n.display(arr);
    }
}
