package ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {
	 public static void main(String[] args) throws IOException {
		    //BufferedReader br = new BufferedReader(
		       //                   new InputStreamReader(System.in));
		    // TODO: fixme.

		  Scanner scanner = new Scanner(System.in);

		  // el num final de la sumatoria
		  int numeroFinal = scanner.nextInt();

		  // el calculos de la sumatoria que se hara en un metodo
		  int suma = calcularSumatoria(numeroFinal);

		  // mostramos el resultado
		  System.out.println(suma);

		  scanner.close();
		}

		// el metodo pa calcular la sumatoria
		public static int calcularSumatoria(int n){
		  int sumatoria = (n * (n + 1))/2;//para la suma de los numero naturales
		  // System.out.println(sumatoria);
		  return sumatoria;
		}

}
