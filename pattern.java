class loop{
 void loop_pattern(){
     int i=1, n=6;
    while(i<=n){
      int j=1;
      if(i==2|| i==3){
        i++;
        continue;
      }
      while(j<=i){
        if(j==1 || j==i){
          System.out.print('1');
        }
        else{
          System.out.print('0');
        }
        j++;
      }
      System.out.println();
    i++;
    }
  }
}

class Pattern{
  public static void main(String a[]){
   loop patt = new loop();
   patt.loop_pattern();
  }
}