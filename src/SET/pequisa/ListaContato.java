package SET.pequisa;

import java.util.HashSet;
import java.util.Set;

public class ListaContato {

    private Set<Contato> listaContatos;

    public ListaContato(){
        this.listaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){
        listaContatos.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos (){
        System.out.println(listaContatos);
    }

    public Set<Contato> pesquisarNome(String nome) {
        Set<Contato> nomePesquisado = new HashSet<>();
        for (Contato c : listaContatos) {
            if (c.getNome().startsWith(nome)) {
                nomePesquisado.add(c);
            }
        }
        return nomePesquisado;
    }

    public void atualizarContata(String nome, int novoNumero){
        for (Contato c : listaContatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ListaContato listacontato = new ListaContato();

        listacontato.adicionarContato("Eli", 345);
        listacontato.adicionarContato("Dalia", 234);
        listacontato.adicionarContato("Pyetra", 546);
        listacontato.adicionarContato("Eli Pinheiro", 545);

        listacontato.exibirContatos();

        System.out.println(listacontato.pesquisarNome("Eli"));

        listacontato.atualizarContata("Eli", 111);

        System.out.println(listacontato.pesquisarNome("Eli"));
    }

}
