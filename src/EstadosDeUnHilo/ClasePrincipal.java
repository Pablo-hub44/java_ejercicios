package EstadosDeUnHilo;

public class ClasePrincipal {
public static void main(String[] args) {
        //estado 1. declaracion del hilo
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();
        
        //2 comenzar el hilo
        hilo1.start();
        
        //3. adormecer el hilo
        try{
        hilo1.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo1 " + e);
        }
        
        hilo2.start();
        //detenet el hilo :)
        hilo2.stop();
        
        try{
        hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo 2 " + e);
        }
    }
}
