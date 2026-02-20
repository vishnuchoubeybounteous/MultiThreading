package Anonymous;

public class SharedResourse {

   public void show(){
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
    
}
