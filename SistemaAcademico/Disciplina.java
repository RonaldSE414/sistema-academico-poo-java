import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        } else {
            System.out.println("Aluno já cadastrado!");
        }
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            a.exibirDados();
            if (a.verificarAprovacao()) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println();
        }
    }
}