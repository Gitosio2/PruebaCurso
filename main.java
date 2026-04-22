import java.util.Scanner;

/**
 * Aplicación Calculadora interactiva de terminal
 * 
 * @author Desarrollador
 * @version 1.0
 */
public class main {
    
    private static Calculadora calculadora;
    private static Scanner scanner;
    
    /**
     * Método principal - punto de entrada de la aplicación
     * 
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        calculadora = new Calculadora();
        scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        System.out.println("**======================================**");
        System.out.println("**   * APLICACION CALCULADORA *      **");
        System.out.println("**======================================**\n");
        
        while (continuar) {
            mostrarMenu();
            String opcion = scanner.nextLine().trim();
            
            switch (opcion) {
                case "1":
                    realizarOperacion("+");
                    break;
                case "2":
                    realizarOperacion("-");
                    break;
                case "3":
                    realizarOperacion("*");
                    break;
                case "4":
                    realizarOperacion("/");
                    break;
                case "5":
                    realizarOperacion("%");
                    break;
                case "6":
                    realizarOperacion("^");
                    break;
                case "7":
                    realizarRaizCuadrada();
                    break;
                case "8":
                    continuar = false;
                    despedirse();
                    break;
                default:
                    System.out.println("\n[!] Opcion no valida. Intenta nuevamente.\n");
            }
        }
        
        scanner.close();
    }
    
    /**
     * Muestra el menú de opciones
     */
    private static void mostrarMenu() {
        System.out.println("\n+========================================+");
        System.out.println("|  Selecciona una operacion:             |");
        System.out.println("+========================================+");
        System.out.println("|  1. Suma            [+]                |");
        System.out.println("|  2. Resta           [-]                |");
        System.out.println("|  3. Multiplicacion  [*]                |");
        System.out.println("|  4. Division        [/]                |");
        System.out.println("|  5. Modulo          [%]                |");
        System.out.println("|  6. Potencia        [^]                |");
        System.out.println("|  7. Raiz Cuadrada   [V]                |");
        System.out.println("|  8. Salir                              |");
        System.out.println("+========================================+");
        System.out.print("Elige tu opcion: ");
    }
    
    /**
     * Realiza una operación binaria con dos números
     * 
     * @param operacion El símbolo de la operación
     */
    private static void realizarOperacion(String operacion) {
        try {
            System.out.print("\nIngresa el primer número: ");
            double num1 = obtenerNumero();
            
            System.out.print("Ingresa el segundo número: ");
            double num2 = obtenerNumero();
            
            double resultado = 0;
            String nombreOperacion = "";
            
            switch (operacion) {
                case "+":
                    resultado = calculadora.sumar(num1, num2);
                    nombreOperacion = "Suma";
                    break;
                case "-":
                    resultado = calculadora.restar(num1, num2);
                    nombreOperacion = "Resta";
                    break;
                case "*":
                    resultado = calculadora.multiplicar(num1, num2);
                    nombreOperacion = "Multiplicación";
                    break;
                case "/":
                    resultado = calculadora.dividir(num1, num2);
                    nombreOperacion = "División";
                    break;
                case "%":
                    resultado = calculadora.modulo(num1, num2);
                    nombreOperacion = "Módulo";
                    break;
                case "^":
                    resultado = calculadora.potencia(num1, num2);
                    nombreOperacion = "Potencia";
                    break;
            }
            
            System.out.println("\n[OK] " + nombreOperacion + ": " + num1 + " " + operacion + " " + num2 + " = " + resultado);
            
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[ERROR] Inesperado: " + e.getMessage());
        }
    }
    
    /**
     * Calcula la raíz cuadrada de un número
     */
    private static void realizarRaizCuadrada() {
        try {
            System.out.print("\nIngresa el número: ");
            double numero = obtenerNumero();
            
            double resultado = calculadora.raizCuadrada(numero);
            System.out.println("\n[OK] Raiz Cuadrada: sqrt(" + numero + ") = " + resultado);
            
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[ERROR] Inesperado: " + e.getMessage());
        }
    }
    
    /**
     * Obtiene un número válido del usuario
     * 
     * @return El número ingresado
     */
    private static double obtenerNumero() {
        while (!scanner.hasNextDouble()) {
            System.out.print("[!] Entrada invalida. Ingresa un numero: ");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }
    
    /**
     * Muestra un mensaje de despedida
     */
    private static void despedirse() {
        System.out.println("\n**======================================**");
        System.out.println("**  * Gracias por usar nuestra *     **");
        System.out.println("**     * CALCULADORA! *              **");
        System.out.println("**======================================**\n");
    }
    
    /**
     * Constructor de la clase
     */
    public main() {
        // Inicialización de la clase
    }
}
