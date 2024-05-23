package LIST.ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {


    //Atributos
    private List<Pessoa> listaPessoas;


    //Construtor
    public OrdenacaoPessoa(){
        this.listaPessoas = new ArrayList<>();
    }



    public void  adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordemPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordemPorAltura(){
        List<Pessoa> pessoalPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoalPorAltura, new ComparetorPorAltura());
        return pessoalPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa  ordenarPessoa = new OrdenacaoPessoa();
        ordenarPessoa.adicionarPessoa("eli", 30, 1.76);
        ordenarPessoa.adicionarPessoa("dalia", 31, 1.56);
        ordenarPessoa.adicionarPessoa("pyetra", 0, 65);


        System.out.println(ordenarPessoa.ordemPorIdade());
        System.out.println(ordenarPessoa.ordemPorAltura());
    }

}



