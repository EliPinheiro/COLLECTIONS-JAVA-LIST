package SET.lista_alunos;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> gerenciadorAlunos;

    public GerenciadorAlunos(){
        this.gerenciadorAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        gerenciadorAlunos.add(new Aluno(nome, matricula, nota));
    }
    public void  removerAluno(int matricula){
        for (Aluno a : gerenciadorAlunos){
            if (matricula == a.getMatricula()){
                gerenciadorAlunos.remove(a);
                break;
            }
        }
    }
    public void exibirAlunos(){
        System.out.println(gerenciadorAlunos);
    }

    public Set<Aluno> organizarPorNome(){
        Set<Aluno> porNome = new TreeSet<>(gerenciadorAlunos);
        return porNome;
    }

    public Set<Aluno> organizarPorNota(){
        Set<Aluno> porNota = new TreeSet<>(new PorNota());
        porNota.addAll(gerenciadorAlunos);
        return porNota;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Eli", 1234, 9.0);
        gerenciadorAlunos.adicionarAluno("Dalia", 3453, 7.0);
        gerenciadorAlunos.adicionarAluno("Pyetra", 5432, 10.0);
        gerenciadorAlunos.adicionarAluno("Ana", 5432, 7.0);

        //gerenciadorAlunos.removerAluno(1234);
        gerenciadorAlunos.exibirAlunos();
        Set<Aluno> porNome = gerenciadorAlunos.organizarPorNome();
        System.out.println(porNome);

        Set<Aluno> porNota = gerenciadorAlunos.organizarPorNota();
        System.out.println(porNota);
    }
}
