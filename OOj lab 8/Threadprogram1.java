class NewThread1 extends Thread{
    
    public void run(){
        
               
        for(int i=5; i>0; i--){
            System.out.println("BMS College of Engineering");
            try{
                
                Thread.sleep(10000);
            }catch (InterruptedException e) {
                System.out.println("Interrupt!!!");
            }
        }
    }
}
class NewThread2 extends Thread{
    
    public void run(){
        for(int i=20; i>0; i--){
            System.out.println("CSE");
            try{
               Thread.sleep(2000);
            } catch (InterruptedException e) {
            System.out.println("Interrupt!!!");
            }
        }
    }
}



public class Threadprogram1 {
    public static void main (String args[]){
        NewThread1 n1= new NewThread1();
        NewThread2 n2= new NewThread2();
        n1.start();
        n2.start();
    }
}
