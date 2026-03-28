public class AlunoPosGraduacao extends Aluno {

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