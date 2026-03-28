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