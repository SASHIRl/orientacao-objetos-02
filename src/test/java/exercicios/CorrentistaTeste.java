package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {

    @Test
    public void criarObjetoCorrentista() {
        Correntista c1 = new Correntista ("SP3032175", "Diego Marques da Costa", "die@gmail.com", 40028922);
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos () {
        Correntista c1 = new Correntista("SP3032175", "Diego Marques da Costa", "die@gmail.com", 40028922);
        assertNotNull(c1.getCodigo());
        assertNotNull(c1.getNome());
        assertNotNull(c1.getEmail());
        assertNotNull(c1.getTelefone());
    }
}