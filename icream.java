import java.util.*;
class icreamexception extends Exception{
    icreamexception(String flavour){
        super("Exceed"+ flavour);
    }
}

class cream{
    String flavour;
    int scoops;
    void setflavour(String flavour){
        this.flavour = flavour;
    }

    void setscoops(int scoops)throws icreamexception{
        if(scoops>3){
            throw new icreamexception(this.flavour);
        }else{
          this.scoops = scoops;
        }
    }
}


class icream{
  public static void main(String args[]){
        String flavour;
        int scoops;
        Scanner up = new Scanner(System.in);
        System.out.println("Enter the Flavour : ");
        flavour = up.next();
        System.out.println("Enter the Scoops : ");
        scoops = up.nextInt();

        try{
          cream n = new cream();
          n.setflavour(flavour);
          n.setscoops(scoops);
        }
        catch(icreamexception e){
            System.err.println("The flavour of the scoops was "+ e.getMessage());
        }
  }
}