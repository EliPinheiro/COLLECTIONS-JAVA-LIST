package main.java.list.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;


    //construtor
    public  ListaTarefas (){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void  removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getTafera().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public  int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Study english.");
        listaTarefas.adicionarTarefa("Jogar o lixo fora.");
        listaTarefas.adicionarTarefa("Alimentar o cachorro.");

        listaTarefas.removerTarefa("Alimentar o cachorro.");


        System.out.println("O número total de tarefas é igual a " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }

}
