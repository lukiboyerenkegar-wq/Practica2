import java.util.Scanner;
public class Appp {
    /**
    Método principal que se ejecuta y solicita al usuario que ingrese un numero entero
     */
    public static void main(String[] args) {
        // Variable donde se almacenará el número entero válido ingresado por el usuario.
        int numero = 0;

        // Objeto Scanner para leer la entrada del usuario.
        Scanner sc = new Scanner(System.in);

        // Bucle infinito que termina solo cuando el usuario introduce un entero válido.
        while (true) {
            System.out.println("Escribe un numero entero");
            //revisa si la informacion que te enviaron se puede convertir a un entero
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                break; // Sale del ciclo cuando el dato es válido.
            } else {
                System.out.println("No es valido");
                // Limpia la entrada inválida para evitar un bucle infinito.
                sc.nextLine();
            }
        }

        System.out.println("numero valido: " + numero);
    }
}