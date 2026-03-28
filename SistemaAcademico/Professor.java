public class Professor {
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