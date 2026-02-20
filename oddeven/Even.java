package oddeven;

public class Even implements Runnable{
    Shared share=null;
    public Even(Shared share){
        this.share=share;
    }
    @Override
     public void run(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                share.even(i);
            }
        }
    }
}
