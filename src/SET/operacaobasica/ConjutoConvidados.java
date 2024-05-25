package SET.operacaobasica;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {
    private Set<Convidado> listaConvidados;

    public ConjutoConvidados() {
        this.listaConvidados = new HashSet<>();
    }
    public void adicionarConvidade(String nome, int codigoConvite){
        listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerPorCondigo(int condigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado c : listaConvidados){
            if (c.getCodigoConvite() == condigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        listaConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return listaConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(listaConvidados);
    }

    public static void main(String[] args) {
        ConjutoConvidados conjuntoConvidados = new ConjutoConvidados();

        System.out.println("existem " + conjuntoConvidados.contarConvidados()+ " dentro da minha lista.");

        conjuntoConvidados.adicionarConvidade("Eli", 23);
        conjuntoConvidados.adicionarConvidade("Dalia", 43);
        conjuntoConvidados.adicionarConvidade("Pyetra", 4);
        conjuntoConvidados.adicionarConvidade("Sonia", 4);
        System.out.println("existem " + conjuntoConvidados.contarConvidados()+ " dentro da minha lista.");

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerPorCondigo(23);
        conjuntoConvidados.exibirConvidados();
    }
}
