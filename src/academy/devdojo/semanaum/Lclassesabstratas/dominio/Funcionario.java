package academy.devdojo.semanaum.Lclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularDesconto();
    }
    public abstract double calcularDesconto ();

}
