package map.pesquisa;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Integer , Produto> estoqueProdutos;

    public EstoqueProduto(){
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Integer produto, String nome, int quantidade, double preco){
        estoqueProdutos.put(produto, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    public double valorTotalEstoque(){
        double valorTotal =0d;
        if (!estoqueProdutos.isEmpty()){
        for (Produto p : estoqueProdutos.values()){
            valorTotal += (p.getPreco() * p.getQuantidade());
            }
        }
        return valorTotal;
    }
    public Produto maisCaro(){
        Produto produtoMaisCaro = null;
        double caro = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() > caro){
                    caro = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto maisBarato(){
        Produto produtoMaisBarato = null;
        double barato = Double.MAX_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() < barato){
                    barato = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto maiorvalorQuantidadeEstoque(){
        Produto caro = null;
        double total = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                double totalTemporario = p.getPreco() * p.getQuantidade();
                if (totalTemporario > total){
                    total = totalTemporario;
                    caro = p;
                }
            }
        }
        return caro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueCompleto = new EstoqueProduto();

        estoqueCompleto.adicionarProduto(24233423, "Lasanha", 10, 123.99);
        estoqueCompleto.adicionarProduto(234235, "Camil", 14, 52.99);
        estoqueCompleto.adicionarProduto(2342, "queijo", 200, 40.99);

        estoqueCompleto.adicionarProduto(1213, "trigo", 5, 4.99);
        estoqueCompleto.adicionarProduto(234323323, "milho", 23, 100.00);

        estoqueCompleto.exibirProdutos();


        //Produto caro = estoqueCompleto.maisCaro();
        //Produto barato = estoqueCompleto.maisBarato();
        //System.out.println("O produto mais caro é o "+ caro + " e o mais barato é o " + barato + ".");

        Produto maisValioso = estoqueCompleto.maiorvalorQuantidadeEstoque();
        System.out.println(maisValioso);

    }


}
