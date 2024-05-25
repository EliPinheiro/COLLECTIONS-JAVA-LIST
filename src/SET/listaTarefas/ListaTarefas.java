package SET.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new HashSet<>();
    }

    public void tarefas(){
        System.out.println(listaTarefas);
    }
    public void adicionarTarefa(String tarefa, boolean concluida){
        listaTarefas.add(new Tarefa(tarefa, concluida));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : listaTarefas){
            if (descricao.equalsIgnoreCase(t.getDescricao())){
                listaTarefas.remove(t);
                break;
            }
        }

    }

    public int contarTarefas(){
        return listaTarefas.size();
    }


    public Set<Tarefa> tarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefas){
            if (t.getConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> tarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefas){
            if (!t.getConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : listaTarefas){
            if (descricao.equalsIgnoreCase(t.getDescricao())){
                t.setConcluida(true);
                break;
            }
        }
    }
    public void limparLista(){
        listaTarefas.clear();
    }















    public static void main(String[] args) {
        ListaTarefas lista  = new ListaTarefas();

        lista.adicionarTarefa("tarefa 1", true);
        lista.adicionarTarefa("tarefa 2", false);
        lista.adicionarTarefa("tarefa 3", true);
        //lista.removerTarefa("tarefa 1");
        lista.tarefas();
        //Set<Tarefa> notDone = lista.tarefasPendentes();
        lista.marcarTarefaConcluida("tarefa 2");
        lista.tarefas();
        lista.limparLista();
        lista.tarefas();


    }


}
