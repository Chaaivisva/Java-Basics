import java.lang.Thread;
public class t1 {
  public static void main(String args[]){
      mythread1 th1 = new mythread1();
      mythread2 t2 = new mythread2();
      Thread th2 = new Thread(t2);
      mythread3 th3 = new mythread3();
      mythread4 th4 = new mythread4();
      mythread5 th5 = new mythread5();
      th1.start();
      th2.start();
      th3.start();
      th4.start();
      th5.start();
  }
}

class mythread1 extends Thread{
  public void run(){
    System.out.println("Hii I am chaai visva.");
    Thread.currentThread().setPriority(MAX_PRIORITY);
    System.out.println(Thread.currentThread().getPriority());
  }
}

class mythread2 implements Runnable{
  public void run(){
    System.out.println("Hii");
    Thread.currentThread();
    System.out.println(Thread.currentThread().getPriority());
  }
}

class mythread3 extends Thread{
  public void run(){
    System.out.println("Hello");
    Thread.currentThread().setPriority(MIN_PRIORITY);
    System.out.println(Thread.currentThread().getPriority());
  }
}

class mythread4 extends Thread{
  public void run(){
    System.out.println("Hello world");
    Thread.currentThread().setPriority(NORM_PRIORITY);
    System.out.println(Thread.currentThread().getPriority());
  }
}

class mythread5 extends Thread{
  public void run(){
    System.out.println("Str");
    Thread.currentThread().setPriority(7);
    System.out.println(Thread.currentThread().getPriority());
  } 
}
