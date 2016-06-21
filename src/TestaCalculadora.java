import org.junit.Assert;
import org.junit.Test;

public class TestaCalculadora {

	// Essa anotação indica ao JUnit que esse método é um caso de teste. Para executar
	// os testes da classe basta clicar com o botão direito na mesma e escolher:
	// "Run As" > "JUnit Test"
	
	@Test //passo 1
	public void testaComStringVazia() {
		Calculadora c = new Calculadora();
		
		int saida = c.soma("");
		// É esperado que saída seja 0. Portanto, verifica se a saída é a esperada
		// usando a biblioteca JUnit:
		Assert.assertEquals(0, saida);
		
		// Uma outra maneira de fazer a mesma coisa seria:
//		if (saida != 0) {
//			Assert.fail("A saída deveria ser 0, mas é " + saida);
//		}
	}
	@Test//passo 2
		public void testaStringComNumeroUnico() {
			Calculadora c = new Calculadora();
			
			
			// É esperado que saída seja um número.
			// usando a biblioteca JUnit:
			Assert.assertEquals(1, c.soma("1"));
			Assert.assertEquals(44, c.soma("44"));
			Assert.assertEquals(21, c.soma("21"));
	}
	
	@Test//passo 3
	public void testaStringQtdeQualquer() {
		Calculadora c = new Calculadora();
		
		
		// É esperado que saída seja a soma dos valores inseridos.
		// usando a biblioteca JUnit:
		Assert.assertEquals(20, c.soma("9,1,10"));
		Assert.assertEquals(34, c.soma("10,14,10"));
		Assert.assertEquals(-2, c.soma("2,-4"));
}
	@Test//passo 4
	public void QuebraLinha() {
		Calculadora c = new Calculadora();
		
		
		// É esperado que saída seja a soma dos valores inseridos.
		// usando a biblioteca JUnit:
		Assert.assertEquals(20, c.soma("9\n1\n10"));
		Assert.assertEquals(34, c.soma("10\n14\n10"));
		Assert.assertEquals(-2, c.soma("2\n-4"));
}
}
