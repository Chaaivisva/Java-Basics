class MultiplesOfFive implements Runnable {
  private int limit;

  public MultiplesOfFive(int limit) {
      this.limit = limit;
  }

  @Override
  public void run() {
      for (int i = 1; i <= limit; i++) {
          if (i % 5 == 0) {
              System.out.println(Thread.currentThread().getName() + ": " + i);
          }
          try {
              Thread.sleep(500); 
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

public class MulThread {
  public static void main(String[] args) {
      int limit = 50; 

      MultiplesOfFive multiplesOfFive = new MultiplesOfFive(limit);

      Thread thread1 = new Thread(multiplesOfFive, "Thread 1");
      Thread thread2 = new Thread(multiplesOfFive, "Thread 2");

      thread1.start();
      thread2.start();
  }
}
