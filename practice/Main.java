package practice;

public class Main {
    public static void main(String args[]){
      SharedResource sr=new SharedResource();
      Thread mythread1=new Thread(sr::increment);
      Thread mythread2=new Thread(sr::increment);
      mythread2.start();
      mythread1.start();
    }
}
