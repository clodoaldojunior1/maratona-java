package academy.devdojo.semanaum.Lclassesabstratas.test;

import academy.devdojo.semanaum.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.semanaum.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.semanaum.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Goku", 12000);
        System.out.println(desenvolvedor);
    }


}
