import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;




public class TestMatematica {

	@Test
    public void getResultado() {
        List<String> numeros = Matematica.INSTANCE.getResultado("numeros");
        assertEquals(2, resultado.size());
        assertTrue("resultado", resultado.contains("numero1"));
        assertTrue("resultado", resultado.contains("numero2"));
    }
	
	
	
	@Test
    public void getNumeroExt() {
        try {
            Matematica.INSTANCE.getNumeroExt(-1);
            fail("Exception not thrown");
        } catch (IndexOutOfBoundsException ex) {
           assertEquals("-1", ex.getMessage());
        }
    }
	
	
	@Test(expected = IndexOutOfBoundsException.class)
    public void getResultadoException() {
        Matematica.INSTANCE.getNumeroExt(-1);
    }
}
