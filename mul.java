import java.util.Scanner;

class Candidate extends Thread{
    String name;
    String locality;
    public void run(){
        System.out.println("Candidate thread 1: "+this.name+"  Candidate's locality: "+this.locality);
    }
}

class Can extends Thread{
    String name;
    String locality;
    public void run(){
        System.out.println("Candidate Thread 2: "+this.name+"  Candidate's locality: "+this.locality);
    }
}


public class mul {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Candidate arr[] = new Candidate[6];
        for(int i=0;i<6;i++){
            Candidate c = new Candidate();
            System.out.println("Enter the name of the candidate: ");
            c.name = sc.next();
            System.out.println("Enter whether local or nonlocal:");
            c.locality = sc.next();
            if(c.locality.equals("nonlocal")){
                c.setPriority(10);
            }else{
                c.setPriority(5);
            }
            arr[i] = c;
        }
        Can arr[] = new Can[6];
       
        for(int i=0;i<6;i++){
            arr[i].start();
        }
    }
   
}