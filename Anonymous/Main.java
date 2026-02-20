package Anonymous;

public class Main {
    
    public static void main(String[] args){
        SharedResourse sr=new SharedResourse();
       Thread t1=new Thread(sr::show);
       Thread t2=new Thread(sr::show);
       t1.start();
       t2.start();
    }
}
