package LIST.pesquisa;

import java.util.ArrayList;
import java.util.List;


public class CatalogoLivros {
    private List<Livros> catalogoLivros;

    public CatalogoLivros(){
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anopublicalao){
        catalogoLivros.add(new Livros(titulo, autor, anopublicalao));
    }
    public List<Livros> pesquisaPorAutor(String autor){
        List<Livros> livrosPorAutor = new ArrayList<>();
            if (!catalogoLivros.isEmpty()) {
                for (Livros l : catalogoLivros){
                    if (l.getAutor().equalsIgnoreCase(autor)){
                        livrosPorAutor.add(l);
                    }
                }
            }
            return livrosPorAutor;
    }

    public List<Livros> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livros> porIntevalo = new ArrayList<>();
        if (!catalogoLivros.isEmpty()) {
            for (Livros l : catalogoLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    porIntevalo.add(l);
                }
            }
        }
        return porIntevalo;
    }

    public Livros pesquisaPorTitulo(String titulo) {
        Livros livroPorTitulo = null;
        if (!catalogoLivros.isEmpty()) {
            for (Livros l : catalogoLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalagoLivros = new CatalogoLivros();

        catalagoLivros.adicionarLivros("Livro 1", "Eli", 1994);
        catalagoLivros.adicionarLivros("Livro 2", "Dalia", 2020);
        catalagoLivros.adicionarLivros("Livro 1", "Eli", 2021);
        catalagoLivros.adicionarLivros("Livro 3", "Dalia", 1994);
        catalagoLivros.adicionarLivros("Livro 4", "Pyetra", 2023);


        System.out.println(catalagoLivros.pesquisaPorAutor("Pyetra"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(1990,2000));
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 1"));
    }
}
