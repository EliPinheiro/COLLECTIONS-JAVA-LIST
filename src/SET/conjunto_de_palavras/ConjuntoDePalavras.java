package SET.conjunto_de_palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> listaPalavras;

    public ConjuntoDePalavras(){
        this.listaPalavras = new HashSet<>();
    }

    public void adiconarPalavra(String palavra){
        listaPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        listaPalavras.remove(palavra);
    }
    public boolean verificarPalavra(String palavra){
        return listaPalavras.contains(palavra);
    }

    public void exibirPalavras(){
        System.out.println(listaPalavras);
    }

    public static void main(String[] args) {
        ConjuntoDePalavras conjuntoPalavras = new ConjuntoDePalavras();
        conjuntoPalavras.adiconarPalavra("eli");
        conjuntoPalavras.adiconarPalavra("dalia");
        conjuntoPalavras.adiconarPalavra("pyetra");
        conjuntoPalavras.adiconarPalavra("dalia");

        conjuntoPalavras.exibirPalavras();

        //conjuntoPalavras.removerPalavra("eli");

        boolean contain = conjuntoPalavras.verificarPalavra("eli");

        System.out.println(contain);

        for (String p : conjuntoPalavras.listaPalavras){
            System.out.println(p);
        }

    }

}
