import java.util.Scanner;
import java.util.Stack;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int opt = 0;
        Stack<Integer> pfibonacci = m.llenarpila();
        boolean bandera = true;
        while (bandera) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ordenar la pila de manera ascendente");
            System.out.println("2. Buscar y eliminar un elemento de la pila");
            System.out.println("3. Mostrar la pila ordenada");
            System.out.println("4. Salir");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese una opción valida: ");
                sc.next();
            }
            opt = sc.nextInt();
            switch (opt) {
                case 1:

                    pfibonacci = m.ordenar(pfibonacci);
                    System.out.println("Pila ordenada: " + pfibonacci);
                    break;

                case 2:

                    System.out.print("Ingrese el elemento que desea buscar y eliminar: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Por favor, ingrese un número válido.");
                        sc.next();
                    }
                    int elemento = sc.nextInt();
                    String resultado = m.buscaryeliminar(pfibonacci, elemento);
                    System.out.println(resultado);
                    break;

                case 3:

                    System.out.println("Pila actualizada: " + pfibonacci);
                    break;

                case 4:
                
                    System.out.println("Saliendo del programa...");
                    bandera = false;
                    break;
                default:
                    System.out.println("pagina en mantenimiento");
                    break;
            }
        }

    }
}
