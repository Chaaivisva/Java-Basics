// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class icecreamconeexception extends Exception{
    icecreamconeexception(String flavour){
        super(flavour+"Exceeds 3 scoops");
    }
}
class icecreamcone{
    String flavour;
    int scoop;
    void setflavour(String flavour){
        this.flavour=flavour;
    }
    void setscoops(int scoop) throws icecreamconeexception{
        if(scoop>3){
            throw new icecreamconeexception(this.flavour);
        }
        else{
            this.scoop=scoop;
        }
        
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        icecreamcone v=new icecreamcone();
        try{
            System.out.print("Enter the flavour:");
            String flavour=n.next();
            v.setflavour(flavour);
            System.out.print("Enter the no.of scoops:");
            int scoop=n.nextInt();
            v.setscoops(scoop);
            System.out.println(flavour+"flavor set");

        }catch(icecreamconeexception e){
            System.out.println("Cannot set greater than 3\n"+e.getMessage());
        }
    }
}