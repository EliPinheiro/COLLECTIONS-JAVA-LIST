package SET.ordenaçãoset;

import SET.pequisa.Contato;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> listaProdutos;

    public CadastroProduto(){
        this.listaProdutos = new HashSet<>();
    }
    public void adicionarProduto( int codigo,String nome, double preco, int quantidade){
        listaProdutos.add(new Produto( codigo, nome,preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(listaProdutos);
        return produtoPorNome;
    }

    public Set<Produto>exibirProdutosPorPreco() {
            Set<Produto> produtoPorPreco = new TreeSet<>( new ComparatorPorPreco());
            produtoPorPreco.addAll(listaProdutos);
            return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastros = new CadastroProduto();

        cadastros.adicionarProduto(1234,"leite", 4.16, 12);
        cadastros.adicionarProduto(3456,"carne", 40.0, 67);
        cadastros.adicionarProduto(8965,"arroz", 32.99, 43);
        cadastros.adicionarProduto(8965,"feijao", 8.99, 34);

        Set<Produto> porNome = cadastros.exibirProdutoPorNome();
        Set<Produto> porCodigo = cadastros.exibirProdutosPorPreco();

        System.out.println(porCodigo);

    }
}
