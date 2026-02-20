package oddeven;

public class Odd {
    synchronized public void odd(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+" :"+i);
            }
        }
    }
}