import java.util.ArrayList;

// =======================
// TAREFA 1 - Classe Aluno (atributos, construtor, exibirDados)
// =======================
abstract class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula, double nota) {

        // =======================
        // TAREFA 3 - Validação no construtor
        // =======================
        if (nome == null || nome.isEmpty()) {
            this.nome = "Nome não informado";
        } else {
            this.nome = nome;
        }

        this.matricula = matricula;

        if (nota < 0 || nota > 10) {
            this.nota = 0;
        } else {
            this.nota = nota;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }

    // =======================
    // TAREFA 2 - Encapsulamento (set/get)
    // =======================
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public double getNota() {
        return nota;
    }

    // =======================
    // TAREFA 5 - Ajustar Nota
    // =======================
    public void ajustarNota(double novaNota) {
        setNota(novaNota);
    }

    // =======================
    // TAREFA 9 - Método abstrato
    // =======================
    public abstract boolean verificarAprovacao();
}


// =======================
// TAREFA 4 - AlunoGraduacao
// =======================
class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome, String matricula, double nota) {
        super(nome, matricula, nota);
    }

    @Override
    public boolean verificarAprovacao() {
        return getNota() >= 7;
    }
}


// =======================
// TAREFA 4 - AlunoPosGraduacao
// =======================
class AlunoPosGraduacao extends Aluno {

    public AlunoPosGraduacao(String nome, String matricula, double nota) {
        super(nome, matricula, nota);
    }

    @Override
    public boolean verificarAprovacao() {
        return getNota() >= 6;
    }

    public void publicarArtigo() {
        System.out.println("Artigo publicado!");
    }
}


// =======================
// TAREFA 6 - Classe Professor
// =======================
class Professor {
    private String nome;
    private String matricula;
    private double salario;

    public Professor(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;

        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double valor) {
        if (valor > 0) {
            salario += valor;
        } else {
            System.out.println("Valor inválido!");
        }
    }
}


// =======================
// TAREFA 7 - ProfessorEfetivo
// =======================
class ProfessorEfetivo extends Professor {

    public ProfessorEfetivo(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }
}


// =======================
// TAREFA 7 - ProfessorTemporario
// =======================
class ProfessorTemporario extends Professor {
    private int mesesContrato;

    public ProfessorTemporario(String nome, String matricula, double salario, int mesesContrato) {
        super(nome, matricula, salario);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public void aumentarSalario(double valor) {
        if (mesesContrato > 0) {
            super.aumentarSalario(valor);
        } else {
            System.out.println("Contrato encerrado! Não pode aumentar salário.");
        }
    }
}


// =======================
// TAREFA 8 - Classe Disciplina
// =======================
class Disciplina {
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


// =======================
// CLASSE PRINCIPAL - Testes
// =======================
public class SistemaAcademico {
    public static void main(String[] args) {

        AlunoGraduacao a1 = new AlunoGraduacao("João", "001", 8);
        AlunoPosGraduacao a2 = new AlunoPosGraduacao("Maria", "002", 5);

        ProfessorEfetivo prof1 = new ProfessorEfetivo("Carlos", "P01", 5000);
        ProfessorTemporario prof2 = new ProfessorTemporario("Ana", "P02", 3000, 0);

        Disciplina d1 = new Disciplina("POO", prof1);

        d1.adicionarAluno(a1);
        d1.adicionarAluno(a2);

        d1.listarAlunos();

        prof2.aumentarSalario(500);
    }
}