package practice;

public class SharedResource {
    int count=0;
   public void increment(){
     for(int i=1;i<=20;i++){
        count++;
        System.out.print(count+" ");
     }

   }
}
