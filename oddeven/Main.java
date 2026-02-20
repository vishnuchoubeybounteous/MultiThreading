package oddeven;

public class Main extends Thread {
  
    public static void main(String[] args) {
        Shared share=new Shared();
        Odd odd=new Odd(share);
        Even even=new Even(share);
        Thread t1=new Thread(odd);
        Thread t2=new Thread(even);
        t1.start();
        t2.start();
   }
}
