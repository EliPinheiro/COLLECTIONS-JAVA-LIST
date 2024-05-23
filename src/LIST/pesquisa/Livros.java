package LIST.pesquisa;

public class Livros {
    //Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    public Livros(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
