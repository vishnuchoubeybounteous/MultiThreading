package oddeven;

public class Odd implements Runnable{
    Shared share=null;
    public Odd(Shared share){
        this.share=share;
    }
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2==1){
                share.odd(i);
            }
        }
    }
}