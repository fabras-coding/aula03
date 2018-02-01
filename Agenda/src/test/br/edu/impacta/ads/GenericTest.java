package test.br.edu.impacta.ads;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;

public class GenericTest {

	ContatoDaoArquivo cdao;

	@Test
	public void testTest() {
		ContatoDaoArquivo cdao = new ContatoDaoArquivo("contatos.txt");
		List <Contato> lista = cdao.lerTodos();
		assertNotNull("Não existe um arquivo de dados.", lista);
	}
	
	@Test
	public void testTest2() {
		ContatoDaoArquivo cdao = new ContatoDaoArquivo("contatos.txt");
		Contato fulano = new Contato("fulano", "12345");
		cdao.inserir(fulano);
		assertTrue(cdao.existe(fulano));
	}
}
