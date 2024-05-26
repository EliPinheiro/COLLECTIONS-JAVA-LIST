package map.ordenacao;

import map.pesquisa.Produto;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> programacaoEvent;

    public AgendaEventos(){
        this.programacaoEvent = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao){
        programacaoEvent.put(data, new Evento(nomeEvento, nomeAtracao));

    }


    public void datasOrdenadas(){
        Map<LocalDate, Evento> datasOrganizadas = new TreeMap<>(programacaoEvent);
        System.out.println(datasOrganizadas);
    }

     public void obterProximoEvento(){
        /*
         Set<LocalDate> dataSet = programacaoEvent.keySet(); // retorna todas as chaves
         Collection<Evento>values = programacaoEvent.values(); // retorn todos os valores
         programacaoEvent.get(chave) // retorna o valor dessa chave
         */

          LocalDate dataAtual = LocalDate.now();
          LocalDate proximaData = null;
          Evento proximoEvento = null;

          Map<LocalDate, Evento> eventoMap = new TreeMap<>(programacaoEvent);
          for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
              if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                  proximoEvento = entry.getValue();
                  proximaData = entry.getKey();
                  System.out.println("O proximo evento : " + proximoEvento + " acontecerá na data " + proximaData);
                  break;
              }
          }
     }


    public static void main(String[] args) {
        AgendaEventos agendaCompleta = new AgendaEventos();
        agendaCompleta.adicionarEvento(LocalDate.of(1994, Month.MAY ,26), "Nacimento2", "Eli" );
        agendaCompleta.adicionarEvento(LocalDate.of(1992, 2,27), "Nacimento1", "Dalia" );
        agendaCompleta.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER ,28), "Nacimento3", "Pyetra" );
        agendaCompleta.adicionarEvento(LocalDate.of(2024, 5 ,30), "Evento", "Eli" );
        agendaCompleta.datasOrdenadas();
        agendaCompleta.obterProximoEvento();
    }
}
