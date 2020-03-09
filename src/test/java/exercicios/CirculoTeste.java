package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CirculoTeste {

    @Test
    public void criarObjetoCirculo() {
        Circulo c1 = new Circulo(6.00);
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoBase() {
        Circulo c1 = new Circulo(6.00);
        c1.setRaio(10.0);
        assertNotNull(c1.getRaio());
    }

    @Test
    public void metodoCalcularArea() {

        Circulo c1 = new Circulo (6.00);
        Double valorEsperado = 113.03999999999999;
        Double valorObtido = c1.CalcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo c1 = new Circulo(6.00);

        Double valorEsperado = 37.68;
        Double valorObtido = c1.CalcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}