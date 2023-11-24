package exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Livros {

	private List<Livro> listaLivros;

	public List<Livro> getListaLivros() {
		return Collections.unmodifiableList(listaLivros);
	}

	public List<Livro> adicionarLivro(Livro novoLivro) {
		if (listaLivros == null) {
			listaLivros = new ArrayList<>();
		}
		boolean encontrou = false;
		int i = 0;

		if (listaLivros.size() > 0) {
			do {
				Livro livro = listaLivros.get(i);
				encontrou = livro.getIsbn().equalsIgnoreCase(novoLivro.getIsbn());

			} while (!encontrou && i < listaLivros.size());
		}

		if (!encontrou) {
			listaLivros.add(novoLivro);
		}

		return listaLivros;
	}

}
