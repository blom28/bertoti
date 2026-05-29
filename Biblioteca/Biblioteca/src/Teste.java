import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {
    @Test
    public void test() {
        Biblioteca bib = new Biblioteca();
        bib.cadastrarLivro(new Livro("Dom Casmurro", "Machado de Assis", "Romance"));
        assertEquals(bib.getLivros().size(), 1);
        List<Livro> encontrados = bib.buscarLivroTituloAutor(new Livro("Dom Casmurro", "Machado de Assis", "Romance"));
        assertEquals(encontrados.get(0).getAutor(), "Machado de Assis");
    }
}