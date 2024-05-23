package LIST.carrinho_de_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributos
    private List<Item> carrinho;

    //construtor
    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        carrinho.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome){
        List<Item> itemsRemover = new ArrayList<>();

        for( Item i : carrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemsRemover.add(i);
            }
        }
        carrinho.removeAll(itemsRemover);
    }
    public double caucularValorTotal(){
        double valorTotal = 0.0;
        for (Item i : carrinho){
            double valor = i.getPreco() * i.getQuantidade();
            valorTotal += valor;
        }
        return valorTotal;
    }


    public void exibirItemns(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 2, 32.99);
        carrinho.adicionarItem("Leite", 12, 4.18);
        carrinho.adicionarItem("Macarrao", 4, 7.99);
        carrinho.adicionarItem("Arroz", 1, 22.99);
        carrinho.adicionarItem("Carne", 2, 40.00);

        carrinho.exibirItemns();
        double total = carrinho.caucularValorTotal();
        System.out.println("O valor total da compra ficou em " + total+" dollars.");

        carrinho.removerItem("Arroz");

        double totalAtualizado = carrinho.caucularValorTotal();
        System.out.println("O valor total da compra ficou em " + totalAtualizado+" dollars.");

        carrinho.exibirItemns();
    }
}






