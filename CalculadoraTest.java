import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de tests para la clase Calculadora
 * 
 * Realiza pruebas unitarias de todos los métodos de la calculadora
 * 
 * @author Desarrollador
 * @version 1.0
 */
public class CalculadoraTest {
    
    private Calculadora calculadora;
    
    /**
     * Se ejecuta antes de cada test para inicializar la calculadora
     */
    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }
    
    // ==================== TESTS PARA SUMA ====================
    
    @Test
    public void testSumaPositivos() {
        double resultado = calculadora.sumar(5, 3);
        assertEquals("5 + 3 debe ser 8", 8, resultado, 0.001);
    }
    
    @Test
    public void testSumaNegativoPositivo() {
        double resultado = calculadora.sumar(-5, 3);
        assertEquals("-5 + 3 debe ser -2", -2, resultado, 0.001);
    }
    
    @Test
    public void testSumaNegativos() {
        double resultado = calculadora.sumar(-5, -3);
        assertEquals("-5 + -3 debe ser -8", -8, resultado, 0.001);
    }
    
    @Test
    public void testSumaCero() {
        double resultado = calculadora.sumar(0, 5);
        assertEquals("0 + 5 debe ser 5", 5, resultado, 0.001);
    }
    
    @Test
    public void testSumaDecimales() {
        double resultado = calculadora.sumar(2.5, 3.7);
        assertEquals("2.5 + 3.7 debe ser 6.2", 6.2, resultado, 0.001);
    }
    
    // ==================== TESTS PARA RESTA ====================
    
    @Test
    public void testRestaPositivos() {
        double resultado = calculadora.restar(10, 3);
        assertEquals("10 - 3 debe ser 7", 7, resultado, 0.001);
    }
    
    @Test
    public void testRestaNegativoPositivo() {
        double resultado = calculadora.restar(-5, 3);
        assertEquals("-5 - 3 debe ser -8", -8, resultado, 0.001);
    }
    
    @Test
    public void testRestaNegativos() {
        double resultado = calculadora.restar(-5, -3);
        assertEquals("-5 - (-3) debe ser -2", -2, resultado, 0.001);
    }
    
    @Test
    public void testRestaCero() {
        double resultado = calculadora.restar(5, 0);
        assertEquals("5 - 0 debe ser 5", 5, resultado, 0.001);
    }
    
    @Test
    public void testRestaDecimales() {
        double resultado = calculadora.restar(5.5, 2.3);
        assertEquals("5.5 - 2.3 debe ser 3.2", 3.2, resultado, 0.001);
    }
    
    // ==================== TESTS PARA MULTIPLICACIÓN ====================
    
    @Test
    public void testMultiplicacionPositivos() {
        double resultado = calculadora.multiplicar(4, 5);
        assertEquals("4 * 5 debe ser 20", 20, resultado, 0.001);
    }
    
    @Test
    public void testMultiplicacionNegativoPositivo() {
        double resultado = calculadora.multiplicar(-4, 5);
        assertEquals("-4 * 5 debe ser -20", -20, resultado, 0.001);
    }
    
    @Test
    public void testMultiplicacionNegativos() {
        double resultado = calculadora.multiplicar(-4, -5);
        assertEquals("-4 * -5 debe ser 20", 20, resultado, 0.001);
    }
    
    @Test
    public void testMultiplicacionPorCero() {
        double resultado = calculadora.multiplicar(5, 0);
        assertEquals("5 * 0 debe ser 0", 0, resultado, 0.001);
    }
    
    @Test
    public void testMultiplicacionDecimales() {
        double resultado = calculadora.multiplicar(2.5, 4.0);
        assertEquals("2.5 * 4 debe ser 10", 10, resultado, 0.001);
    }
    
    // ==================== TESTS PARA DIVISIÓN ====================
    
    @Test
    public void testDivisionPositivos() {
        double resultado = calculadora.dividir(10, 2);
        assertEquals("10 / 2 debe ser 5", 5, resultado, 0.001);
    }
    
    @Test
    public void testDivisionNegativoPositivo() {
        double resultado = calculadora.dividir(-10, 2);
        assertEquals("-10 / 2 debe ser -5", -5, resultado, 0.001);
    }
    
    @Test
    public void testDivisionNegativos() {
        double resultado = calculadora.dividir(-10, -2);
        assertEquals("-10 / -2 debe ser 5", 5, resultado, 0.001);
    }
    
    @Test
    public void testDivisionDecimales() {
        double resultado = calculadora.dividir(7.5, 2.5);
        assertEquals("7.5 / 2.5 debe ser 3", 3, resultado, 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionPorCero() {
        calculadora.dividir(10, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionCeroPorCero() {
        calculadora.dividir(0, 0);
    }
    
    // ==================== TESTS PARA MÓDULO ====================
    
    @Test
    public void testModuloPositivos() {
        double resultado = calculadora.modulo(10, 3);
        assertEquals("10 % 3 debe ser 1", 1, resultado, 0.001);
    }
    
    @Test
    public void testModuloNegativoPositivo() {
        double resultado = calculadora.modulo(-10, 3);
        assertEquals("-10 % 3 debe ser -1", -1, resultado, 0.001);
    }
    
    @Test
    public void testModuloCero() {
        double resultado = calculadora.modulo(0, 5);
        assertEquals("0 % 5 debe ser 0", 0, resultado, 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testModuloPorCero() {
        calculadora.modulo(10, 0);
    }
    
    // ==================== TESTS PARA POTENCIA ====================
    
    @Test
    public void testPotenciaPositiva() {
        double resultado = calculadora.potencia(2, 3);
        assertEquals("2^3 debe ser 8", 8, resultado, 0.001);
    }
    
    @Test
    public void testPotenciaExponenteCero() {
        double resultado = calculadora.potencia(5, 0);
        assertEquals("5^0 debe ser 1", 1, resultado, 0.001);
    }
    
    @Test
    public void testPotenciaExponenteNegativo() {
        double resultado = calculadora.potencia(2, -1);
        assertEquals("2^-1 debe ser 0.5", 0.5, resultado, 0.001);
    }
    
    @Test
    public void testPotenciaBaseNegativaExponentePar() {
        double resultado = calculadora.potencia(-2, 2);
        assertEquals("-2^2 debe ser 4", 4, resultado, 0.001);
    }
    
    @Test
    public void testPotenciaBaseNegativaExponenteImpar() {
        double resultado = calculadora.potencia(-2, 3);
        assertEquals("-2^3 debe ser -8", -8, resultado, 0.001);
    }
    
    @Test
    public void testPotenciaDecimales() {
        double resultado = calculadora.potencia(2.5, 2);
        assertEquals("2.5^2 debe ser 6.25", 6.25, resultado, 0.001);
    }
    
    // ==================== TESTS PARA RAÍZ CUADRADA ====================
    
    @Test
    public void testRaizCuadradaPositiva() {
        double resultado = calculadora.raizCuadrada(9);
        assertEquals("√9 debe ser 3", 3, resultado, 0.001);
    }
    
    @Test
    public void testRaizCuadradaCero() {
        double resultado = calculadora.raizCuadrada(0);
        assertEquals("√0 debe ser 0", 0, resultado, 0.001);
    }
    
    @Test
    public void testRaizCuadradaDecimal() {
        double resultado = calculadora.raizCuadrada(2);
        assertEquals("√2 debe ser aproximadamente 1.414", 1.414, resultado, 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRaizCuadradaNegativa() {
        calculadora.raizCuadrada(-1);
    }
    
    @Test
    public void testRaizCuadrada100() {
        double resultado = calculadora.raizCuadrada(100);
        assertEquals("√100 debe ser 10", 10, resultado, 0.001);
    }
    
    // ==================== TESTS DE CASOS ESPECIALES ====================
    
    @Test
    public void testValoresGrandes() {
        double resultado = calculadora.sumar(1000000, 1000000);
        assertEquals("Suma de valores grandes", 2000000, resultado, 0.001);
    }
    
    @Test
    public void testValoresPequenos() {
        double resultado = calculadora.sumar(0.001, 0.002);
        assertEquals("Suma de valores pequeños", 0.003, resultado, 0.001);
    }
}
