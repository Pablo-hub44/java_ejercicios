package SincronizacionDeHilos;

public class Hilo1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + ": G");

            try {
                Hilo1.sleep(1000);//dormimos por un 1 seg el proceso
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo1 " + e);
            }
        }
    }
}