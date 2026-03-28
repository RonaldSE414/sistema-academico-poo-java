public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome, String matricula, double nota) {
        super(nome, matricula, nota);
    }

    @Override
    public boolean verificarAprovacao() {
        return getNota() >= 7;
    }
}