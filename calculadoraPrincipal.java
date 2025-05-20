		package Principal;
import java.util.Scanner;

import Datos.*;
public class calculadoraPrincipal {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		datosCalculadora z = new datosCalculadora();
		
		int opcion;
		double a,b;
		
		do {
			 System.out.println("\n--- CALCULADORA ---");
	            System.out.println("1. Suma");
	            System.out.println("2. Resta");
	            System.out.println("3. Multiplicación");
	            System.out.println("4. División");
	            System.out.println("0. Salir");
	            System.out.print("Elige una opción: ");
	            opcion = p.nextInt();
	            if (opcion >= 1 && opcion <= 4) {
	                System.out.print("Ingresa el primer número: ");
	                a = p.nextDouble();

	                System.out.print("Ingresa el segundo número: ");
	                b = p.nextDouble();

	                double resultado = 0;

	                switch (opcion) {
	                    case 1:
	                        resultado = z.suma(a, b);
	                        break;
	                    case 2:
	                        resultado = z.resta(a, b);
	                        break;
	                    case 3:
	                        resultado = z.multiplicacion(a, b);
	                        break;
	                    case 4:
	                        if (b != 0) {
	                            resultado = z.division(a, b);
	                        } else {
	                            System.out.println("⚠️ No se puede dividir entre cero.");
	                            continue;
	                        }
	                        break;
	                }

	                System.out.println("Resultado: " + resultado);
	            } else if (opcion != 0) {
	                System.out.println("Opción inválida.");
	            }

		}while(opcion !=0);

        System.out.println("Programa finalizado.");
	}

}
