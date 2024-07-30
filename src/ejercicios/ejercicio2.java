package ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio2 {
	 public static void main(String[] args) throws IOException {
		    Scanner scanner = new Scanner(System.in);

		        // Leer el número de la pos en la sucesión de Fibonacci
		        int posicion = scanner.nextInt();

		        // con el metodo, Mostrar la sucesión de Fibonacci hasta la posición especificada
		        mostrarFibonacci(posicion);

		        scanner.close();
		    }

		    // Método p calcular y mostrar la sucesión de Fibonacci hasta una posición dada
		    public static void mostrarFibonacci(int n) {
		        int fib1 = 0;
		        int fib2 = 1;

		        System.out.print("1"); // Mostrar el primer número de Fibonacci

		        // Calcular y mostrar los siguientes números de Fibonacci hasta la posición n
		        for (int i = 2; i <= n; i++) {
		            int fib = fib1 + fib2;
		            System.out.print(" " + fib);

		            // Mostrar la operación realizada para obtener el siguiente número de Fibonacci
		            // System.out.print(" | " + fib1 + " + " + fib2 + " = " + fib);

		            // Actualizar los dos últimos números de Fibonacci
		            fib1 = fib2;
		            fib2 = fib;
		        }

		        System.out.println(); // Imprimir un salto de línea al final
		    }

}
