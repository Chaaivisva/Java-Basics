import java.util.*;

class Pattern{

    public int loop(){
        int n = 6;

        int i = 1;
        while (i <= n) {
            int j = 1;
            if(i == 2 || i == 3)
            {
                i++;
                continue;
            }
            while (j <= i) {
                if (j == 1 || j == i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                j++;
            }
            System.out.println(); 
            i++;
        }
        return 0;


    }
}
public class primeno {
    public static void main(String args[])
    {
        Pattern C = new Pattern();
        C.loop();
}
}