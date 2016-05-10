import org.junit.Assert;
import org.junit.Test;

public class TestaCalculadora {

	// Essa anotação indica ao JUnit que esse método é um caso de teste. Para executar
	// os testes da classe basta clicar com o botão direito na mesma e escolher:
	// "Run As" > "JUnit Test"
	@Test
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
	
}
