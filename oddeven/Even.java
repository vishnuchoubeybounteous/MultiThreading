package oddeven;

public class Even{
    synchronized public void even(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+" :"+i);
            }
        }
    }
}
