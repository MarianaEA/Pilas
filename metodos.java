import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class metodos {
    public Stack<Integer> llenarpila() {
        Stack<Integer> pila = new Stack<>();
        Stack<Integer> pilaf = new Stack<>();

        for (int i = 1; i <= 8; i++) {
            int numero = ((int) (Math.random() * 10));
            pila.push(numero);
            pilaf.push(fibonacci(numero));

        }
        System.out.println("Pila original: " + pila);
        System.out.println("Pila Fibonacci" + pilaf);
        return pilaf;

    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public Stack<Integer> ordenar(Stack<Integer> pilaf) {
        LinkedList<Integer> linkedList = new LinkedList<>(pilaf);
        Collections.sort(linkedList);
        pilaf.clear();
        pilaf.addAll(linkedList);

        return pilaf;

    }

    public String buscaryeliminar(Stack<Integer> pilaf, int elemento) {
        Stack<Integer> aux = new Stack<>();
        String mensaje = "";
        boolean encontrado = false;
        while (!pilaf.isEmpty()){
            if (pilaf.peek().equals(elemento)){
                pilaf.pop();
                mensaje = "El elemento " + elemento + "ha sido encontrado y eliminado correctamente";
                encontrado = true;
                break;

            }else{
                aux.push(pilaf.pop());
            }
            

        }
        while (!aux.isEmpty()){
            pilaf.push(aux.pop());
        }
        if (!encontrado) {
            mensaje = "El elemento " + elemento + " no se encontra en la pila";
        }
                return mensaje;

    }
}
