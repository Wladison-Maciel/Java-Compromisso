import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {

	public calculadora cal = new calculadora();

	@Test
	public void test() {

		
		
		  double soma = cal.somar(2, 3);
		  assertEquals(4, soma);
		 
		 
		/*
		 * Faz uma expectiva de que o valor seja 4 e verifica a variável
		 */

		boolean verifi = cal.verdadeiro(true);
		assertFalse(verifi);

		/*
		 * Verifica se o valor da variavel "verdadeiro" é falso
		 * 
		 * 
		 */

	}

}
