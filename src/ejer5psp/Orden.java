
package ejer5psp;

/**
 *
 * @author Nabor
 */
public class Orden extends Thread{

    public Orden(String str) {
        super(str);
    }
 
 public void run(){ 
  System.out.println(getName());
       
    }
  
    public static void main(String[] args){
        String Thread1 = "Hola, soy el hilo número 1";
        String Thread2 = "Hola, soy el hilo número 2";
        Orden thread1 = new Orden(Thread1); 
        thread1.setPriority(MIN_PRIORITY); 
        Orden thread2 = new Orden(Thread2);
        thread2.setPriority(MAX_PRIORITY); 
        
        thread1.start();
        thread2.start();
        
    }
    
}
