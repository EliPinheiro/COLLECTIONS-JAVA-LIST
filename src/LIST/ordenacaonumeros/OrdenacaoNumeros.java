package LIST.ordenacaonumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros(){
        this.listaNumeros = new ArrayList<>();
    }
    public void adicionarNumero(int number){
        listaNumeros.add(number);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenAscen = new ArrayList<>(listaNumeros);
        Collections.sort(ordenAscen);
        return ordenAscen;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordenDescen = new ArrayList<>(listaNumeros);
        Collections.sort(ordenDescen);
        Collections.reverse(ordenDescen);
        return ordenDescen;
    }



    public static void main(String[] args) {
        OrdenacaoNumeros ordem = new OrdenacaoNumeros();

        ordem.adicionarNumero(23);
        ordem.adicionarNumero(13);
        ordem.adicionarNumero(45);
        ordem.adicionarNumero(6);

        List<Integer> novaListaAsce = ordem.ordenarAscendente();
        System.out.println(novaListaAsce);

        List<Integer> novaListaDesc = ordem.ordenarDescendente();
        System.out.println(novaListaDesc);
    }

}
