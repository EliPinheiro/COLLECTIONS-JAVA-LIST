package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaCotatos;

    public AgendaContato(){
        this.agendaCotatos = new HashMap<>();
    }



    public void adicionarContato(String nome, Integer telefone){
        agendaCotatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaCotatos.isEmpty()) {
            agendaCotatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaCotatos);
    }
    public Integer pesquisaPorNome(String nome){
        Integer numeroNome = null;
        if (!agendaCotatos.isEmpty()) {
            if (agendaCotatos.containsKey(nome)){
                numeroNome =  agendaCotatos.get(nome);
            }

        }
        return numeroNome;
    }





    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();
        agenda.adicionarContato("eli", 1234);
        agenda.adicionarContato("dalia", 5677);
        agenda.adicionarContato("pyetra", 8795);


        agenda.exibirContatos();

        agenda.removerContato("eli");

        agenda.exibirContatos();

        Integer tel = agenda.pesquisaPorNome("pyetra");

        System.out.println(tel);
    }



}


