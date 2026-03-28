public abstract class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula, double nota) {
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

    public void ajustarNota(double novaNota) {
        setNota(novaNota);
    }

    public abstract boolean verificarAprovacao();
}