package exercicios;

import exercicios.Conta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta conta;

    @BeforeEach
    public void beforeEach() {
        Conta Conta1 = new Conta();
        Conta1.setNumero(1);
        Conta1.depositar(500.00);
    }

    @AfterEach
    public void afterEach() {
        conta = null;
    }

    @Test
    public void criarObjetoConta() {
        assertNotNull(conta);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(conta.getLimite());
        assertNotNull(conta.getSaldo());
        assertNotNull(conta.getNumero());
    }

    @Test
    public void metodoDepositar() {
        conta.depositar(300.00);
        assertEquals(300.0, conta.getSaldo());
    }
    @Test
    public void metodoSacar() {
        conta.sacar(10.0);
        assertEquals(-10.0, conta.getSaldo());
    }

    @Test
    public void metodoSacarValorInvalido() {
        conta.sacar(400.0);
        assertEquals(-400.0, conta.getSaldo());
    }
    @Test
    public void metodoSacarSaldoInsuficiente() {
        conta.sacar(400.0);
        assertEquals(-1000.0, conta.getSaldo());
    }

    @Test
    public void metodoTransferir() {
        Conta Conta1 = new Conta();
        Conta1.setNumero(1);
        Conta1.depositar(1000.00);
        conta.transferir(Conta1, 200.00);

        assertEquals(200.0, conta.getSaldo());
        assertEquals(300.0, Conta1.getSaldo());
    }
}
