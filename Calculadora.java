/**
 * Clase Calculadora - Realiza operaciones matemáticas básicas
 * 
 * @author Desarrollador
 * @version 1.0
 */
public class Calculadora {
    
    /**
     * Suma dos números
     * 
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la suma
     */
    public double sumar(double a, double b) {
        return a + b;
    }
    
    /**
     * Resta dos números
     * 
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la resta
     */
    public double restar(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números
     * 
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la multiplicación
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Divide dos números
     * 
     * @param a Numerador
     * @param b Denominador
     * @return Resultado de la división
     * @throws IllegalArgumentException si el divisor es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
    
    /**
     * Calcula el módulo (resto de la división)
     * 
     * @param a Dividendo
     * @param b Divisor
     * @return Resto de la división
     * @throws IllegalArgumentException si el divisor es cero
     */
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede calcular módulo con cero");
        }
        return a % b;
    }
    
    /**
     * Calcula la potencia de un número
     * 
     * @param base Base
     * @param exponente Exponente
     * @return Resultado de base^exponente
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    /**
     * Calcula la raíz cuadrada de un número
     * 
     * @param numero Número del cual calcular la raíz
     * @return Raíz cuadrada del número
     * @throws IllegalArgumentException si el número es negativo
     */
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular raíz cuadrada de números negativos");
        }
        return Math.sqrt(numero);
    }
}
