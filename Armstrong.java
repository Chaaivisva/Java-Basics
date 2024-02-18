import static java.lang.Math.*;

public class Armstrong {
  public static void main(String args[]){
        int n=143;
        int temp,last=0,sum=0,digits=0;

        temp = n;
        while(temp>0){
            temp = temp/10;
            digits++;
        }

        temp = n;
        while(temp>0){
            last = temp%10;
            sum += (Math.pow(last,digits));
            temp = temp/10;
        }

        if(n==sum){
            System.out.println("It is the Armstrong Number.");
        }
        else{
          System.out.println("It is not a Armstrong Number.");
        }
  }
}
