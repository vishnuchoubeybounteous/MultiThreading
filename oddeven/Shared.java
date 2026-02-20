package oddeven;

public class Shared{
    boolean available=false;
   synchronized public void odd(int i){
        while(available){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+": "+i);
        available=true;
        notify();
   }
   synchronized public void even(int i){
        while(!available){
             try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+": "+i);
        available=false;
        notify();
   }
}
