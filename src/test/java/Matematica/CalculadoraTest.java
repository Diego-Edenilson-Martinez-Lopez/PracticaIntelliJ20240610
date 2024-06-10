package Matematica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculadoraTest {
    Calculadora calculadora;

    @BeforeEach
    void aliniciar() {
        calculadora = new Calculadora();
    }

    @AfterEach
    void alfinalizar() {
        calculadora = new Calculadora();
    }

    @BeforeAll
    static void aliniciarBeforeClass() throws Exception {
        System.out.println("Iniciando Calculadora");
    }

    @AfterAll
    static void alfinalizarAfterClass() throws Exception {
        System.out.println("Finalizando Calculadora");
    }

    @Test
    @Order(1)
    void sumar() {
        int a = 7;
        int b = 6;
        int resultadoEsperado = 13;
        int resultado = calculadora.sumar(a, b);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @Order(2)
    void restar() {
        int a = 10;
        int b = 6;
        int resultadoEsperado = 4;
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(a, b);
        assertTrue(resultadoEsperado == resultado);
    }

    @Test
    @Order(3)
    void multiplicar() {
        int a = 10;
        int b = 6;
        int resultadoEsperado = 60;
        int resultado = calculadora.multiplicar(a, b);
        if (resultadoEsperado != resultado)
            fail("Resultado incorrecta");
    }

    void dividir() {
        int a = 10;
        int b = 5;
        int resultadoEsperado = 0;
        if (a != 0) {
            int resultado = calculadora.dividir(a, b);
            if (resultadoEsperado != resultado) {
                fail("Resultado incorrecta");
            }
        }
        else {
                assertThrows(ArithmeticException.class,
                        () -> {int rersult = calculadora.dividir(a, b);});
            }

        } ;

    }