package ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) throws IOException {
	    // BufferedReader br = new BufferedReader(
	                          // new InputStreamReader(System.in));
	    // TODO: fixme.

	     Scanner scanner = new Scanner(System.in);

	        // Saldo inicial de José
	        int saldo = 13000;

	        // Leer el número de compras
	        int numCompras = scanner.nextInt();

	        // Realizar las compras
	        for (int i = 0; i < numCompras; i++) {
	            // Leer el monto de la compra actual
	            int montoCompra = scanner.nextInt();

	            // Descontar el monto de la compra del saldo
	            saldo = saldo - montoCompra;
	        }

	        // Imprimir el saldo final
	        System.out.println(saldo);

	        scanner.close();
	  }

}
