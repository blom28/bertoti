import java.util.List;
import java.util.LinkedList;

public class Biblioteca {
    private List<Livro> livros = new LinkedList<Livro>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> buscarLivroTituloAutor(Livro liv) {
        List<Livro> encontrados = new LinkedList<Livro>();
        for (Livro livro : livros) {
            if (livro.comparar(liv)) {
                encontrados.add(livro);
            }
        }
        return encontrados;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}