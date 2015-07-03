package imposto_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculo_Imposto.Imposto;

public class ImpostoTest {

	@Test
	public void valor_Imposto() {
		
		Imposto imposto = new Imposto();
		
		imposto.setCotacao_Dia(3);
		imposto.setValor_Produto_Dolares(100);
		
		double esperado = 180;
		double atual = imposto.valor_Imposto();
		
		assertEquals(esperado, atual, 0.0);
		
	}

	
}
