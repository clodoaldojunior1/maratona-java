package academy.devdojo.semanaum.Lclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularDesconto();
    }
    public double calcularDesconto (){
        return this.salario = this.salario + this.salario *0.1;
    }

}
