import java.lang.Thread;
class Front extends Thread{
    public void run(){
        System.out.println("Running Thread: Forward");
        for(int i=1; i<=10; i++ ){
            System.out.println(i);
        }
    }
}
class Back extends Thread{
    public void run(){
        System.out.println("Running Thread: Backward");
        for(int i=10; i>=1; i--){
            if(i==6){
                try{
                    sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
            System.out.println(i);
        }
    }
}
class Threading{
    public static void main(String[] args) {
        Front f= new Front();
        Back b= new Back();
        b.start();
        f.start();
        
    }
}